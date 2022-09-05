package com.springBoot.topic;

public class Topic {
    private String id;
    private String name;
    private String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public String getId() {
        return id;
    }

}
