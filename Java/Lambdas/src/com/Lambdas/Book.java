package com.Lambdas;

public class Book {
    private String title;
    private String author;
    private String date;

    public Book(String title, String author, String date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public String getTitle() { return title;}
    public String getAuthor() { return author;}
    public String getDate() { return date;}
}