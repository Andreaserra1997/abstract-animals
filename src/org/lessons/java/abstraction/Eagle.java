package org.lessons.java.abstraction;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Conigli e lepri");
    }

    @Override
    public void verse() {
        System.out.println("Strii");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}
