package org.lessons.java.abstraction;

public class Main {
    public static void doFly(CanFly animal) {
        animal.fly();
    }

    public static void doSwim(CanSwim animal) {
        animal.swim();
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Ted");
        Sparrow sparrow = new Sparrow("Ducky");
        Eagle eagle = new Eagle("Aqui");
        Dolphin dolphin = new Dolphin("Willy");

        Animal[] animals = {dog, sparrow,eagle,dolphin};

        for (Animal animal : animals) {
            System.out.println("Nome: " + animal.getName());
            animal.eat();
            animal.sleep();
            animal.verse();
            if (animal instanceof CanFly) {
                doFly((CanFly) animal);
            }
            if (animal instanceof CanSwim) {
                doSwim((CanSwim) animal);
            }
        }
    }
}
