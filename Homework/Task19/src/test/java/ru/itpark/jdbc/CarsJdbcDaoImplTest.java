package ru.itpark.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.itpark.models.Car;
import ru.itpark.models.Human;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.*;

public class CarsJdbcDaoImplTest {
    private CarsJdbcDaoImpl testedCarsJdbcDao;

    @Before
    public void setUp() throws Exception {
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql://localhost:5432/Task14_db";
        Connection connection = DriverManager.getConnection(
                url, name, password);
        testedCarsJdbcDao = new CarsJdbcDaoImpl();
    }

    @Test
    public void findHumanJdbc() {
        Car expected = Car.builder()
                .id(1)
                .number("123")
                .model("toyota")
                .color("grey")
                .build();
        Car actual = testedCarsJdbcDao.find(1);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadUserId() {
        testedCarsJdbcDao.find(44);
    }
}