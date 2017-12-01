package ru.itpark;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static boolean isFound;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы. ");
        System.out.println("Количество строк: ");
        int m = scanner.nextInt();
        System.out.println("Количество столбцов: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rnd.nextInt(10000);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("Введите число, которое надо найти: ");
            int numberToFind = scanner.nextInt();
            if (numberToFind < 0) {
                System.err.println("В матрице содержатся только положительные числа");
            }
            ExecutorService service = Executors.newFixedThreadPool(5);

            Finder finder = new Finder();

            service.submit(() -> finder.linearSearch(matrix, numberToFind));
            service.shutdown();

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new IllegalArgumentException(e);
            }
            if (!isFound) {
                System.out.println("Такого числа в матрице нет");
                break;
            }
            isFound = false;
        }
    }
}
