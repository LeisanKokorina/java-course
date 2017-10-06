package ru.itpark;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("МЕНЮ:");
        System.out.println("1. Показать документ");
        System.out.println("2. Вставить строку в начало");
        System.out.println("3. Вставить строку в конец");
        System.out.println("4. Удалить строку"); // спросить, какую строку удалить - сделать сдвиг
        System.out.println("5. Заменить строку");
        System.out.println("6. Очистить строку");
        System.out.println("7. Выход");
        String string[] = new String[4];
        int count = 0;
        // Обеспечить функционал:
        // добавить строку в конец, в начало, в заданную
        // позицию, заменить строку, удалить строку, вывести весь документ
        Scanner scanner = new Scanner(System.in);
        while (true) {

            int command = scanner.nextInt();

            switch (command) {
                case 1: {
                    for (int i = 0; i < string.length; i++) {
                        // тернарный условный оператор e ? a : b
                        String lineToOut = string[i] == null ? "_______" : string[i];
                        System.out.println(i + ": " + lineToOut);
                    }

                }
                break;
                case 2: {
                    if (count == string.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    for (int i = count; i > 0; i--) {
                        string[i] = string[i - 1];
                    }
                    string[0] = newLine;
                    count++;
                }
                break;
                case 3: {
                    if (count == string.length) {
                        System.err.println("Нет места");
                        break;
                    }
                    System.out.println("Введите строку: ");
                    String newLine = scanner.next();
                    string[count] = newLine;
                    count++;
                }
                break;
                case 4: {
                    System.out.println("Какую строку Вы хотите удалить?");
                    int number = scanner.nextInt();
                    for (int i = number; i < string.length - 1; i++) {
                        string[i] = string[i + 1];
                    }
                    string[string.length - 1] = null;
                    count--;

                }
                break;
                case 5: {
                    System.out.println("Какую строку Вы хотите изменить?");
                    int number = scanner.nextInt();
                    System.out.println("Введите новую строку");
                    String newLine = scanner.next();
                    string[number] = newLine;
                }
                break;
                case 6: {
                    int number = scanner.nextInt();
                    string[number] = null;
                }
                case 7: {
                    System.exit(0);
                }

            }
        }
    }
}
