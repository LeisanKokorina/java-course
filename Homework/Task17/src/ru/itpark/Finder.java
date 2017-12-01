package ru.itpark;

public class Finder {
    public void linearSearch(int a[][], int b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == b) {
                    Main.isFound = true;
                    System.out.println("Число находится в " + i + " - ой строке, в " + j + " - ом столбце");
                    System.out.println("Нашел " + Thread.currentThread().getName());

                }
            }
        }
    }
}
