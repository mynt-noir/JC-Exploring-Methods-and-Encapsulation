package org.example;

import java.util.Arrays;

import static org.example.Converter.celsiusToFahrenheit;
import static org.example.Converter.fahrenheitToCelsius;
import static org.example.ParameterPassing.modifyValue;
import static org.example.VarargsExample.findLargest;
import static org.example.VarargsExample.printMessages;

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

        double celsius1 = 25.0;
        System.out.println(celsius1 + " degrees C is " + celsiusToFahrenheit(celsius1) +" F.");
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


















