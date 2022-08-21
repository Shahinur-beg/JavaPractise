package com.collection;

public class ShowDetails extends Read {
    public void print(){
        System.out.println("Details -----------------------------");
        for(var obj: list){
            System.out.println("Roll : "+ obj.getRoll() + " || "
                               + "Name : " + obj.getName()+ " || "
                               + "Age : " + obj.getAge() + " . ");
            System.out.println("---------------------------------");
        }
    }
}
