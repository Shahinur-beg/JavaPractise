package com.annotation;

public class Main {

    //TODO: Suppress all warning Annotation
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Student student = new Student(20,25);

        System.out.println("Class name : " +student.toString());

        System.out.println("Marks : " +student.calculateMarks());

        Class myClass = student.getClass();
        MyAnnotation annotation = (MyAnnotation) myClass.getAnnotation(MyAnnotation.class);
        System.out.println("Annotation value : " + annotation.myValue());
        System.out.println("Annotation Name : " +annotation.name());
        System.out.println("Annotation City: " +annotation.city());

    }
}

