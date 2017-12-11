package ru.itpark.jdbc;

import ru.itpark.dao.HumansDao;
import ru.itpark.models.Human;

import java.sql.*;
import java.util.List;

public class HumansJdbcDaoImpl implements HumansDao {
    private Connection connection()throws SQLException {
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql://localhost:5432/Task14_db";

        return DriverManager.getConnection(url, name, password);
    }
    @Override
    public Human find(int id) {
        try {
            Connection connection = connection();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM owner WHERE owner.id = ?");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Human human = null;
            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name")+" "
//                        + resultSet.getInt("age")+resultSet.getString("citizen"));
                human = Human.builder()
                        .id(resultSet.getInt("id"))
                        .age(resultSet.getInt("age"))
                        .name(resultSet.getString("name"))
                        .citizen(resultSet.getString("citizen"))
                        .build();
            }
            if(human != null){
                return human;
            }else{
                throw new IllegalArgumentException("User with id <" + id + "> not found");
            }
        }catch (SQLException e){
            throw new IllegalArgumentException(e);
        }
    }

    @Override
    public List<Human> findAllByAge(int age) {
        return null;
    }

    @Override
    public void save(Human model) {

    }



    @Override
    public void update(Human model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Human> findAll() {
        return null;
    }
}
