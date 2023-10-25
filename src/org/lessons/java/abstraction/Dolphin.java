package org.lessons.java.abstraction;

public class Dolphin extends Animal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pesciolini");
    }

    @Override
    public void verse() {
        System.out.println("Swii");
    }
}
