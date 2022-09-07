package com.student.details.entity;

public class Student {
    private int roll;
    private String name;
    private String department;
    private String session;
    public Student(int roll, String name, String department, String session) {
        this.roll = roll;
        this.name = name;
        this.department = department;
        this.session = session;
    }
    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSession() {
        return session;
    }

}
