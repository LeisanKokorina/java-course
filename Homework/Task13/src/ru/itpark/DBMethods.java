package ru.itpark;

import java.sql.*;
import java.util.Scanner;

public class DBMethods {
    public static Connection connection()throws SQLException{
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql:" + "//localhost:5432/task13_db";
        Connection connection = DriverManager.getConnection(url, name, password);
        return connection;
    }
    public static void addOwner(String ownerName, int age){
       try {
           Connection connection = DBMethods.connection();
           PreparedStatement preparedStatement = connection
                   .prepareStatement("INSERT INTO owner(name, age) VALUES (?, ?)");
           preparedStatement.setString(1, ownerName);
           preparedStatement.setInt(2, age);
           preparedStatement.execute();
       }catch (SQLException e){
           throw new IllegalArgumentException(e);
       }
    }
    public static void addCar(String model, int number, int ownerId, String color){
        try {
            Connection connection = DBMethods.connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO car(model, number, owner_Id, color) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, model);
            preparedStatement.setString(2, number);
            preparedStatement.setString(3, ownerId);
            preparedStatement.setInt(4, color);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }


    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ");

        while (resultSet.next()) {
        System.out.print(resultSet.getInt("id"));
        System.out.println(" " + resultSet.getString("name"));
    }

    Scanner scanner = new Scanner(System.in);
    String ownerName = scanner.next();
    int age = scanner.nextInt();
}
