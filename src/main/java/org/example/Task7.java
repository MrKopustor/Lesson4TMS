package org.example;

import java.util.Arrays;


//??? ?? ????????!
public class Task7 {
    public static void main(String[] args) {
        int[] array1 = {9, 9, 9};
        int[] array2 = {2, 4, 6, 8, 0};
        int length = array1.length;

        array1[length - 1] += 1;

        if (array1[length - 1] / 10 == 0) {
            System.out.println(Arrays.toString(array1));
        } else {
            for (int i = length; length >= 0; i++) {
                int d = array1[length - 1] / 10;  //1
                d = array1[length - 2] + d;
                int o = array1[length - 1] % 10; //0
            }
            array1[length - 1] %= 10;
            System.out.println(Arrays.toString(array1));
        }
    }
}

