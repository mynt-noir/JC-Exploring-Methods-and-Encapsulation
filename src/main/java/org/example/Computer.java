package org.example;

public class Computer {
    String brand;
    int ramInGB;

    public Computer() {
        this.brand = "Generic";
        this.ramInGB = 8;
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }
}