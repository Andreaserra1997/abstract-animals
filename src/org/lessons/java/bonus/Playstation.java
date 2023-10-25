package org.lessons.java.bonus;

public class Playstation implements Device {
    @Override
    public void play() {
        System.out.println("Sono una PlayStation e sono in modalità play");
    }

    @Override
    public void stop() {
        System.out.println("Sono una PlayStation e sono in modalità stop");
    }
}
