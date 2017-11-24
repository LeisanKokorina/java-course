package ru.itpark;

import java.sql.*;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {


    public static void main(String[] args) throws SQLException {
        String name = "postgres";
        String password = "Zaq12wsx";
        String url = "jdbc:postgresql:" + "//localhost:5432/kokorina_db";
        Connection connection = DriverManager.getConnection(url, name, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery( "SELECT * FROM owner");

        while(resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(" "+ resultSet.getString("name"));

        }
        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.next();
        int age = scanner.nextInt();
        statement.executeUpdate("INSERT INTO owner"+"( name, age) VALUES ('"+ ownerName +"'," + age+ ");");
    }
}
