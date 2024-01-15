package org.example;

import java.util.Scanner;

public class Task5 {
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
        System.out.println("original");

        int firstElement = array[0];
        int secondElement = array[1];
        for (int j = 0; j < arrayLength; j++) {
            array[0] = array[arrayLength - 1];
            array[arrayLength - 1] = firstElement;
            array[1] = array[arrayLength - 1];
            array[arrayLength - 1] = secondElement;
            System.out.print(array[j] + " ");
        }
        System.out.println("replacement");
        scanner.close();
    }

}