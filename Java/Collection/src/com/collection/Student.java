package com.collection;

public class Student {
    private int roll;
    private String name;
    private int age;
    public Student(int roll, String name, int age){
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
