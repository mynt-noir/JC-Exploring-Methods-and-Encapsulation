package org.example;

import java.util.Arrays;

public class VarargsExample {
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