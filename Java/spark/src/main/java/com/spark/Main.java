package com.spark;
import com.spark.model.CourseIdea;
import com.spark.model.CourseIdeaDAO;
import com.spark.model.SimpleCourseIdeaDAO;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        CourseIdeaDAO dao = new SimpleCourseIdeaDAO();

        before((req, res)->{
            if (req.cookie("username") != null){
                req.attribute("username", req.cookie("username"));
            }
        });

        before("/ideas",(req, res)->{
            if (req.attribute("username") == null){
                res.redirect("/");
                halt();
            }
        });

        get("/",(req,res)-> {
            Map<String, String> model = new HashMap<>();
            model.put("username", req.attribute("username"));
           return new ModelAndView(model,"index.hbs");

        },new HandlebarsTemplateEngine());

        post("/sign-in",(req,res)->{

            Map<String, String> model = new HashMap<>();
            String username = req.queryParams("username");
            res.cookie("username", username);
            model.put("username", username);
            return new ModelAndView(model, "sign-in.hbs");

        },new HandlebarsTemplateEngine());

        get("/ideas",(req, res)->{
            Map<String, ArrayList> model = new HashMap<>();
            model.put("ideas", dao.findAll());
            return  new ModelAndView(model, "ideas.hbs");
        }, new HandlebarsTemplateEngine());

        post("/ideas",(req,res)->{

            Map<String, String> model = new HashMap<>();
            String title = req.queryParams("title");
            CourseIdea courseIdea = new CourseIdea(title,req.attribute("username"));
            dao.add(courseIdea);
            res.redirect("/ideas");
            return null;

        },new HandlebarsTemplateEngine());

        post("/ideas/:slug/vote",(req,res)->{
            CourseIdea idea = dao.findBySlug(req.params("slug"));
            idea.addVoter(req.attribute("username"));
            res.redirect("/ideas");
            return  null;
        });
    }
}