package ru.itpark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DBMethods methods = new DBMethods();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.showMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    System.out.println("Введите имя владельца:");
                    String ownerName = scanner.next();
                    System.out.println("Введите возраст:");
                    int age = scanner.nextInt();
                    methods.addOwner(ownerName, age);

                }
                break;
                case 2: {
                    System.out.println("Введите марку машины:");
                    String model = scanner.next();
                    System.out.println("Введите номер машины:");
                    int number = scanner.nextInt();
                    System.out.println("Введите id владельца");
                    int ownerId = scanner.nextInt();
                    System.out.println("Введите цвет  машины:");
                    String color = scanner.next();
                    methods.addCar(model, number, ownerId, color);
                }
                break;
                case 3: {
                    methods.showOwners();
                }
                break;
                case 4: {
                    methods.showCars();
                }
                case 5: {
                    System.out.println("Введите id владельца");
                    int ownerId = scanner.nextInt();
                    methods.allCarsOfTheOwner(ownerId);
                }break;
                case 6:{
                    System.out.println("Введите цвет машины");
                    String color = scanner.next();
                    methods.showCarsByColor(color);
                }break;
                case 7:{
                    System.exit(0);
                }break;
            }
        }
    }
}
