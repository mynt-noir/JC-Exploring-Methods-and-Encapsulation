package org.example;

public class Car {
    public void startEngine() {
        System.out.println("Engine has started.");
    }

    public String drive(int speed) {
        return "The car is moving at " + speed + " mph.";
    }

    public void turnOffEngine() {
        System.out.println("Engine has been turned off.");
    }

}
