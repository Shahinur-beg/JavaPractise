package com.gradle;

public class Student {
    private String name;
    private int roll;
    private int age;
    public Student(String name, int roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public int getAge() {
        return age;
    }

}
