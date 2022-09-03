package com.spark.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpleCourseIdeaDAO implements CourseIdeaDAO{
    private  List<CourseIdea> ideas;

    public SimpleCourseIdeaDAO() {
        ideas = new ArrayList<>();
    }

    @Override
    public boolean add(CourseIdea idea) {
        return ideas.add(idea);
    }

    @Override
    public ArrayList<CourseIdea>  findAll() {
        return new ArrayList<>(ideas);
    }

    @Override
    public CourseIdea findBySlug(String slug) throws ClassNotFoundException {
        return ideas.stream()
                .filter(idea -> idea.getSlug().equals(slug))
                .findFirst()
                .orElseThrow(ClassNotFoundException::new);
    }

}
