package com.hcl.training.model;

public class Main {

    public static void main(String[] args) {
        Shelter<Cat> s = new Shelter<>();
        //s.add(new Dog("Malu"));
        s.add(new Cat("Romina"));
        //s.add(new Cat("Cheto"));
        //s.add(new Dog("Brandy"));
        //s.add(new Dog("Tito"));
        //s.add(new Dog("Oreo"));
        //s.add(new Dog("Tlacoyo"));

        s.doSomething();
        System.out.println("I get a: " + s.getItem(0));
    }
}
