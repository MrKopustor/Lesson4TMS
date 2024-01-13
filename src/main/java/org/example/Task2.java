package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength;
        do {
            System.out.println("enter a simple integer number");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Enter correct number");
                scanner.next();
            }
            arrayLength = scanner.nextInt();
        } while (arrayLength <= 0);
        System.out.println(arrayLength);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ((int) (Math.random() * 101));
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        for (int j = 0; j < arrayLength; j++) {
            if (array[j] > max) {
                max = array[j];
            }
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("\n" + "max " + max + "\n" + "min " + min);
        scanner.close();
    }
}
