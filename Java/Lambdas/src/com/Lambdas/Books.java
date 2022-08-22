package com.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Books {
    public static List<Book> books(){
        List<Book> book = new ArrayList<>();
        book.add(new Book("C Programming", "Shahinur", "2020"));
        book.add(new Book("Java", "Martin", "2010"));
        book.add(new Book("CPP", "Rumman", "2022"));
        return book;
    }
}
