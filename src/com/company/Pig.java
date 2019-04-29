package com.company;

public class Pig extends Animal {
    public Pig() {
       // super();
        System.out.println("Now I am a Piggy!");
    }
//polymorphism
    //@Override
    public String eat() {
        return "A Pig eat...";
    }

    //@Override
    public String drink() {
        return "A Dog drink ...";
    }

    public String sing() {
        return "A pig sing...";
    }
}
