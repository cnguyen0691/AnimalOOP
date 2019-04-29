package com.company;

public class Dog extends Animal{
    public Dog() {
        //super();
        System.out.println("Now I am a Corgi!");
    }

    //@Override
    public String run() {
        return "A Dog run...";
    }

    //@Override
    public String drink() {
        return "A Dog drink ...";
    }

    public String purr() {
        return "purrr...";
    }
}
