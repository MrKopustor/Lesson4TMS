package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.println("enter a simple integer number");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Enter the correct number");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);

        int[] array = new int[arrayLength];
        System.out.println("Enter an array of " + arrayLength + " element");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }

        int numberOfZero = 0;
        for (int j : array) {
            if (j == 0) {
                numberOfZero++;
            }
        }
        if (numberOfZero > 0) {
            System.out.println("\nNumber of zero " + numberOfZero);
        } else {
            System.out.println("\nno null element");
        }
    }
}