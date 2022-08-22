package com.Lambdas;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Display {
    public void display(){

         List<Book> list = Books.books();
         //TODO: Conventional way
//        Collections.sort(list, new Comparator<Book>() {
//            @Override
//            public int compare(Book b1, Book b2) {
//                return b1.getTitle().compareTo(b2.getTitle());
//            }
//        });
        //TODO: Lambdas Expression
//        Collections.sort(list,(Book b1,Book b2)->{
//            return b1.getTitle().compareTo(b2.getTitle());
//        });

        //TODO: Lambdas Expression short format
        Collections.sort(list,(b1,b2)-> b1.getTitle().compareTo(b2.getTitle()));

        //TODO: Method References
        //Collections.sort(list,Comparator.comparing(Book::getTitle));

        //TODO: Conventional way
//        for (Book book: list){
//            System.out.println("Title: "+ book.getTitle()
//                    + " ||  Author: "+ book.getAuthor()
//                    +" ||  Date: " + book.getDate());
//        }
        //TODO: Lambdas Foreach loop
        list.forEach(book -> System.out.println(book.getTitle() +" "+book.getAuthor()+" "+book.getDate()));

    }
}
