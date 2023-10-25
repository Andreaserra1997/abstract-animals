package org.lessons.java.bonus;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Device dvd = creator.create("lettore dvd");
        Device ps = creator.create("playstation");

        dvd.play();
        dvd.stop();

        ps.play();
        ps.stop();
    }
}
