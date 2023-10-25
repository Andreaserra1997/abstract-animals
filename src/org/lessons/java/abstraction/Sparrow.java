package org.lessons.java.abstraction;

public class Sparrow extends Animal implements CanFly,CanSwim{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Mangio la frutta");
    }

    @Override
    public void verse() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando");
    }
}
