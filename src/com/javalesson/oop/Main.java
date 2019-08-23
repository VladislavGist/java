package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
        Dog lab = new Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charly");
        lab.setBreed("Lab");
        lab.setSize("Awerage");
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Rorry");
        sheppard.setBreed("Sheppard");
        sheppard.setSize("Big");
        sheppard.bite();

        Dog dob = new Dog();
        dob.setPaws(4);
        dob.setTail(1);
        dob.setName("Jack");
        dob.setBreed("Doberman");
        dob.bite();
    }
}
