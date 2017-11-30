package ru.itpark;

import java.util.Arrays;

public class Finder {
    public int linearSearch(int a[][], int b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == b) {
                    return i;
                }
            }
        }
        return -1;
    }
}
