package org.example;

import java.util.Arrays;

import static org.example.Converter.fahrenheitToCelsius;
import static org.example.ParameterPassing.modifyValue;
import static org.example.VarargsExample.findLargest;
import static org.example.VarargsExample.printMessages;
import static org.example.Converter.celsiusToFahrenheit;

public class Main {
    public static void changeStudentName(Student student, String newName) {
        student.name = newName;
    }

    public static void main(String[] args) {
        // EXERCISE 1
        System.out.println("--- EXERCISE 1 ---");
        Car myCar = new Car();
        myCar.startEngine();
        String status = myCar.drive(60);
        System.out.println(status);
        myCar.turnOffEngine();
        System.out.println();


        // EXERCISE 2
        System.out.println("--- EXERCISE 2 ---");
        int originalValue = 50;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
        System.out.println();
        Student student = new Student("Alex");
        System.out.println("Name before change: " + student.name);
        changeStudentName(student, "Jordan");
        System.out.println("Name after change: " + student.name);
        System.out.println();

        // EXERCISE 3
        System.out.println("--- EXERCISE 3 ---");
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();

        System.out.println(findLargest(10, 5, 25, 15));
        System.out.println(findLargest(-5, -1, -10));
        System.out.println(findLargest());
        System.out.println();

        // EXERCISE 4
        System.out.println("--- EXERCISE 4 ---");
        Account myAccount = new Account();
        myAccount.displayAccountDetails();

        System.out.println();
        SmartDoor smartDoor = new SmartDoor();
        System.out.println("Is the door locked? " + smartDoor.isLocked());
        smartDoor.lockDoor();
        System.out.println("Is the door locked? " + smartDoor.isLocked());
        smartDoor.unlockDoor();
        System.out.println("Is the door locked? " + smartDoor.isLocked());
        System.out.println();

        // EXERCISE 5
        System.out.println("--- EXERCISE 5 ---");
        System.out.println("App Name: " + Utility.getAppName());
        Utility utilInstance = new Utility();
        System.out.println("Instance ID: " + utilInstance.getInstanceId());
        System.out.println();

        // EXERCISE 6
        System.out.println("--- EXERCISE 6 ---");
        Display d = new Display();
        d.show(42);
        d.show("Hello");
        d.show("Goodbye", 3);
        System.out.println();

        double celsius = 25.0;
        System.out.println(celsius + " degrees C is " + celsiusToFahrenheit(celsius) +" F.");
        double fahrenheit = 77.0;
        System.out.println(fahrenheit + " degrees F is " + fahrenheitToCelsius(fahrenheit) +" C.");
        System.out.println();

        // EXERCISE 7
        System.out.println("--- EXERCISE 7 ---");
        Pizza pizza1 = new Pizza();
        pizza1.display();

        Pizza pizza2 = new Pizza("Pepperoni");
        pizza2.display();

        Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
        pizza3.display();

        System.out.println();

        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Dell");
        Computer computer3 = new Computer("Apple", 16);

        System.out.printf("Computer 1: Brand = %s, RAM = %dGB\n", computer1.brand, computer1.ramInGB);
        System.out.printf("Computer 2: Brand = %s, RAM = %dGB\n", computer2.brand, computer2.ramInGB);
        System.out.printf("Computer 3: Brand = %s, RAM = %dGB\n", computer3.brand, computer3.ramInGB);
        System.out.println();

        // EXERCISE 8
        System.out.println("--- EXERCISE 8 ---");
        Thermostat stat = new Thermostat(22.5);
        System.out.println("Initial temp: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(5.0); // Try to set an invalid temp
        System.out.println("Temp after invalid change: " + stat.getTemperatureCelsius());

        stat.setTemperatureCelsius(25.0); // Set a valid temp
        System.out.println("Temp after valid change: " + stat.getTemperatureCelsius());
        System.out.println();

        User user = new User();
        System.out.println("Current masked password: " + user.getPassword());
        user.setPassword("pass");
        System.out.println("Current masked password: " + user.getPassword());
        user.setPassword("secure_password_123");
        System.out.println("Current masked password: " + user.getPassword());
    }
}

class Car {
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

class ParameterPassing {
    public static void modifyValue(int value) {
        value = 100;
        System.out.println("Inside method: " + value);
    }
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

class VarargsExample {
    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static int findLargest(int... numbers) {
        int largest;

        if (numbers.length == 0) {
            System.out.print("Largest with no numbers is: ");

            return Integer.MIN_VALUE;
        } else {
        largest = numbers[0];
        for (int number : numbers) {
            largest = Math.max(number, largest);
        }
        System.out.print("Largest in " + Arrays.toString(numbers) + " is: ");
        return largest;
        }
    }
}

class SmartDoor {
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

class Utility {
    public static String getAppName() {
        return "My Awesome App";
    }

    public String getInstanceId() {
        return "ID-12345";
    }
}

class Converter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius*(9.0/5.0)) + 32.0;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit-32.0)*(5.0/9.0));
    }
}

class Display {

    public void show(String message) {
        System.out.println("Message: " + message);
    }

    public void show(String message, int times) {
        System.out.println("Repeating Message:");
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    public void show(int number) {
        System.out.println("Number: " + number);
    }
}

class Pizza {
    private String toppings;
    private int size;

    public Pizza() {
        this.toppings = "Cheese";
        this.size = 12;
        System.out.println("Default pizza created.");
    }

    public Pizza(String toppings) {
        this();
        this.toppings = toppings;
        System.out.println("Pizza with custom toppings created.");
    }

    public Pizza(String toppings, int size) {
        this.toppings = toppings;
        this.size = size;
        System.out.println("Fully custom pizza created.");
    }

    public void display() {
        System.out.println("Size: " + size + " inches, Toppings: " + toppings);
    }
}

class Computer {
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

class Thermostat {
    private double temperatureCelsius;

    public Thermostat(double temp) {
        setTemperatureCelsius(temp);
    }

    public double getTemperatureCelsius() {
        return this.temperatureCelsius;
    }

    public void setTemperatureCelsius(double temp) {
        if (temp >= 10.0 && temp <= 30.0) {
            this.temperatureCelsius = temp;
        } else {
            System.out.println("Error: Temperature must be between 10.0 and 30.0 Celsius.");
        }
    }
}

class User {
    private String password;

    public User() {
        this.password = "default1";
    }

    public String getPassword() {
        return "*".repeat(this.password.length());
    }

    public void setPassword(String password) {
        System.out.printf("Attempting to set short password '%s'...\n", password);
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters long.");
        }
    }
}