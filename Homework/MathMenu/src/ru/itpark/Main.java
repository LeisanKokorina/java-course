package ru.itpark;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Меню");
        System.out.println("1.Считать два числа");
        System.out.println("2.Сумма чисел");
        System.out.println("3.Разность чисел");
        System.out.println("4.Произведение");
        System.out.println("5.Выход");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int command = scanner.nextInt();
            if (command == 1) {
                while (true) {
                    System.out.println("Введите первое число");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число");
                    int b = scanner.nextInt();
                    System.out.println("Введите команду");
                    int choice = scanner.nextInt();
                    while (choice != 1) {
                        switch (choice) {
                            case 2:
                                int c = a + b;
                                System.out.println("a + b = " + c);
                                break;
                            case 3:
                                c = a - b;
                                System.out.println("a - b = " + c);
                                break;
                            case 4:
                                c = a * b;
                                System.out.println("a * b = " + c);
                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Неверная команда");
                        }
                        System.out.println("Введите команду");
                        choice = scanner.nextInt();
                    }
                }
            } else {
                System.out.println("Начните с команды ввода чисел, пожалуйста!");
            }
        }
    }
}