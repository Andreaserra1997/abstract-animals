package org.lessons.java.abstraction;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Mangio i croccantini");
    }

    @Override
    public void verse() {
        System.out.println("Woof");
    }
}
