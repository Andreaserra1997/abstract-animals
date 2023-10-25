package org.lessons.java.bonus;

public class Creator {
    public Device create(String deviceType) {
        if ("lettore dvd".equals(deviceType)) {
            return new Dvd();
        } else if ("playstation".equals(deviceType)) {
            return new Playstation();
        } else {
            throw new IllegalArgumentException("Tipo di dispositivo non supportato");
        }
    }
}
