package com.Animals;

public class Dog extends Animal {
    public Dog(){
        super("Barking");
    }
    @Override
    public void animalDetails() {
        System.out.print("Dog eat meat and ");
        makeSound();
    }
}
