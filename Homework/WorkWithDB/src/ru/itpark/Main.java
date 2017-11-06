package ru.itpark;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws SQLException {
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql:" + "//localhost:5432/kokorina_db";
        Connection connection = DriverManager.getConnection(url, name, password);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ");

        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id"));
            System.out.println(" " + resultSet.getString("name"));
        }

        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.next();
        int age = scanner.nextInt();


        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO owner(name, age) VALUES (?, ?)");
        preparedStatement.setString(1, ownerName);
        preparedStatement.setInt(2, age);
        preparedStatement.execute();

    }
}
