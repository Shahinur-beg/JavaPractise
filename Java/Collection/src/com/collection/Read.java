package com.collection;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    Scanner scanner = new Scanner(System.in);
    private  int roll;
    private String name;
    private int age;
    public static ArrayList<Student> list = new ArrayList<>();
    public int readInput(){
        System.out.println("Press 1 for entering details && Press 2 for showing details && press 0 for exit");
        System.out.print("Input : ");
        int input = scanner.nextInt();
        return input;
    }
    public void readValue(){
        roll = readRoll();
        name = readName();
        age = readAge();
        Student student = new Student(roll,name,age);
        list.add(student);
        System.out.println("Done------------------------");
    }
    private int readRoll(){
        while (true){
            System.out.print("Roll : ");
            String roll = scanner.next();
            if(isValid(roll)){
                return  Integer.parseInt(roll);
            }
            else
                System.out.println("Roll must be Integer and greater than zero!!");
        }
    }
    private String readName(){
        System.out.print("Name : ");
        String name = scanner.next();
        return name;
    }
    private int readAge(){
        while (true){
            System.out.print("Age : ");
            String age = scanner.next();
            if(isValid(age))
                return Integer.parseInt(age);
            else
                System.out.println("Age must be Integer and greater than zero!!");
        }
    }
    private boolean isValid(String number){
        if(number.charAt(0)=='0')
            return  false;
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) < '0' || number.charAt(i) > '9')
                return false;
        }
        return  true;
    }

}
