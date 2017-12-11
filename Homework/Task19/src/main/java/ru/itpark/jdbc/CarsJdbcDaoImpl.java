package ru.itpark.jdbc;

import ru.itpark.dao.CarsDao;
import ru.itpark.models.Car;

import java.sql.*;
import java.util.List;

public class CarsJdbcDaoImpl implements CarsDao {
    private Connection connection()throws SQLException {
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql://localhost:5432/Task14_db";

        return DriverManager.getConnection(url, name, password);
    }

    @Override
    public Car find(int id) {
        try {
            Connection connection = connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM car WHERE car.id = ?");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Car car = null;
            while (resultSet.next()) {
//                System.out.println(resultSet.getString("number")+" "
//                        + resultSet.getString("model")+resultSet.getString("color"));
                car =  Car.builder()
                       .id(resultSet.getInt("id"))
                       .number(resultSet.getString("number"))
                       .model(resultSet.getString("model"))
                       .color(resultSet.getString("color"))
                       .build();

            }
            if(car != null){
                return car;
            }else {
                throw new IllegalArgumentException("Car with id <" + id + "> not found");
            }
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public void save(Car model) {

    }

    @Override
    public void update(Car model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public List<Car> findAllByColor(String color) {
        return null;
    }
}
