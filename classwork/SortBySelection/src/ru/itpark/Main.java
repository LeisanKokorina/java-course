package ru.itpark;

import java.util.Arrays;

public class Main {
    //29.09.2017

    public static int sum(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    public static void sortBySelection(int array[]) {
        int minIndex;
        int min;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int x[] = {2, 1, -4, 6, 1, 2, 5};
        System.out.println("Array before sort: " + Arrays.toString(x));
        sortBySelection(x);
        System.out.println("Array after sort: " + Arrays.toString(x));
        int sumOfArrayElements = sum(x);
        System.out.println(sumOfArrayElements);
    }
}