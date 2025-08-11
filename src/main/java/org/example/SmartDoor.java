package org.example;

public class SmartDoor {
    private boolean isLocked;

    public void lockDoor() {
        this.isLocked = true;
        System.out.println("Locking the door...");
    }

    public void unlockDoor() {
        this.isLocked = false;
        System.out.println("Unlocking the door...");
    }

    public boolean isLocked() {
        return isLocked;
    }
}