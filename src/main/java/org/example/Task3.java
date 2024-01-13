package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Task3 {
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

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ((int) (Math.random() * 101));
            System.out.print(array[i] + " ");
        }

        int IndexOfMax = 0;
        int indexOfMin = 0;
        for (int j = 0; j < arrayLength; j++) {
            if (array[j] > array[IndexOfMax]) {
                IndexOfMax = j;
            }
            if (array[j] < array[indexOfMin]) {
                indexOfMin = j;
            }
        }
        System.out.println("\n" + "max element index " + IndexOfMax + "\n" + "min element index " + indexOfMin);
        scanner.close();
    }
}
