package com.spark.model;

import com.github.slugify.Slugify;

import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CourseIdea {
    private String title;
    private String creator;
    private String slug;
    private Set<String> voters;
    public CourseIdea(String title, String creator) {
        voters = new HashSet<>();
        this.title = title;
        this.creator = creator;
        try {
            Slugify slugify = new Slugify();
            slug = slugify.slugify(title);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addVoter(String voter){
        return voters.add(voter);
    }
    public int getVoteCount(){
        return voters.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseIdea that = (CourseIdea) o;
        return Objects.equals(title, that.title) && Objects.equals(creator, that.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, creator);
    }

    public String getTitle() {
        return title;
    }
    public String getCreator() {
        return creator;
    }
    public String getSlug() { return slug; }

}
