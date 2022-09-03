package com.spark.model;

import java.util.ArrayList;
import java.util.Objects;

public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    ArrayList<CourseIdea> findAll();

    CourseIdea findBySlug(String slug) throws ClassNotFoundException;
}
