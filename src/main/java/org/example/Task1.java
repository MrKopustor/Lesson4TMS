package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Task1 {
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
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ((int) (Math.random() * 101));
            System.out.print(array[i] + " ");
        }
        System.out.println("straight");

        for (int j = arrayLength - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println("reverse");
        scanner.close();
    }
}


