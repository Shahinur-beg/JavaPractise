package com.Practise;

public class Student {
    private String firstName;
    private  String lastName;
    private int age;
    private static int studentCount = 0;
    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }
    public void setAge(int age) {
        if(age<=0)
            throw new IllegalArgumentException("Age must be greater than zero");
        else
            this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public static int noOfStudent(){
        return studentCount;
    }

}
