package com.Animals;

abstract public class Animal {
    private String sound;
    public Animal(String sound){
        this.sound = sound;
    }
    public void makeSound(){
        System.out.println(sound);
    }
    abstract public void animalDetails();
}
