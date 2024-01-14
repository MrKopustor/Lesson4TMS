package org.example;

import java.util.Scanner;
import java.util.Arrays;

public class Task6 {
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
        }

        System.out.println("original " + Arrays.toString(array));
        boolean growingArray = true;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] > array[i + 1]) {
                growingArray = false;
                break;
            }
        }
        if (growingArray == true) {
            System.out.println("Growing Array");
        } else {
            System.out.println("Not growing array");
        }
    }
}