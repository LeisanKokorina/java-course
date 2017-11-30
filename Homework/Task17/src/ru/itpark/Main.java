package ru.itpark;

import sun.nio.ch.ThreadPool;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

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
        System.out.println("Введите число, которое надо найти: ");
        int numberToFind = scanner.nextInt();
        if (numberToFind < 0) {
            System.err.println("В матрице содержатся только положительные числа");
        }
        ExecutorService service = Executors.newFixedThreadPool(m);

        Finder finder = new Finder();

        for (int i = 0; i < m; i++) {
            service.submit(() -> finder.linearSearch(matrix, numberToFind));
        }


    }
}
