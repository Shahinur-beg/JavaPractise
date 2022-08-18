package com.Animals;

public class Cow extends Animal {
    public Cow(){
        super("Mooing");
    }
    @Override
    public void animalDetails() {
        System.out.print("Cow eat grass and ");
        makeSound();
    }
}
