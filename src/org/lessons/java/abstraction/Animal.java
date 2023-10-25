package org.lessons.java.abstraction;

public abstract class Animal {
    //ATTRIBUTI
    private String name;

    //COSTRUTTORI
    public Animal(String name) {
        this.name = name;
    }

    //GETTER E SETTER
    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void eat();
    public abstract void verse();

}
