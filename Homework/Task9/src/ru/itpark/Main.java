package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню");
            System.out.println("1. Добавить число");
            System.out.println("2. Удалить число");
            System.out.println("3. Найти число. Вернуть индекс");
            System.out.println("4. Добавить число по индексу");
            System.out.println("5. Вернуть объект Iterator");

            int command = scanner.nextInt();
            switch (command){
                case 1: {
                    System.out.println("Введите число: ");
                    int element = scanner.nextInt();
                    list.add(element);
                }
                break;
                case 2: {
                    System.out.println("Введите порядковый номер числа, которое нужно удалить: ");
                    int index =  scanner.nextInt();
                    list.delete(index);
                }
                break;
                case 3: {
                    System.out.println("Введите число, индекс которого нужно вернуть: ");
                    int element = scanner.nextInt();
                    list.returnIndex(element);
                }
                break;
                case 4: {
                    
                }
            }

        }


    }
}
