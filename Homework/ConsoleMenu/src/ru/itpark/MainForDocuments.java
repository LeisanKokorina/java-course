package ru.itpark;

import java.io.IOException;
import java.util.Scanner;

public class MainForDocuments {
    static void workWithDocument(Document document) {

        if(document == null){
            System.err.println("Такого документа не существует");
        }else {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                Menu.showMenu();
                int command = scanner.nextInt();
                switch (command) {
                    case 1: {
                        document.showDocument();
                    }
                    break;
                    case 2: {
                        if (document.count == document.lines.length) {
                            System.err.println("Нет места");
                            break;
                        }
                        System.out.println("Введите строку: ");
                        String newLine = scanner.next();
                        document.addLineToBegin(newLine);
                    }
                    break;
                    case 3: {
                        if (document.count == document.lines.length) {
                            System.err.println("Нет места");
                            break;
                        }
                        System.out.println("Введите строку: ");
                        String newLine = scanner.next();
                        document.addLineToEnd(newLine);

                    }
                    break;
                    case 4: {
                        System.out.println("Какую строку Вы хотите удалить?");
                        int number = scanner.nextInt();
                        document.deleteLine(number);


                    }
                    break;
                    case 5: {
                        System.out.println("Какую строку Вы хотите изменить?");
                        int number = scanner.nextInt();
                        System.out.println("Введите новую строку");
                        String newLine = scanner.next();
                        document.lines[number] = newLine;
                        document.removeLine(newLine, number);
                    }
                    break;
                    case 6: {
                        int number = scanner.nextInt();
                        document.lines[number] = null;
                        document.clearLine(number);
                    }
                    case 7: {
                        return;
                    }
                }
            }
        }

    }
}
