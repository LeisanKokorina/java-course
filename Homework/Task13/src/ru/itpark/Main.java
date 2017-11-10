package ru.itpark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     while (true){
         Menu.showMenu();
         int command = scanner.nextInt();
         switch (command){
             case 1:{
                 System.out.println("Введите имя владельца:");
                 String ownerName = scanner.next();
                 System.out.println("Введите возраст:");
                 int age = scanner.nextInt();
                 DBMethods.addOwner(ownerName,age);

             }break;
             case 2:{
                 System.out.println("Введите марку машины:");
                 String model = scanner.next();
                 System.out.println("Введите номер машины:");
                 int number = scanner.nextInt();
                 System.out.println("Введите id владельца");
                 int ownerId = scanner.nextInt();
                 System.out.println("Введите цвет  машины:");
                 String color = scanner.next();

             }
         }
     }
    }
}
