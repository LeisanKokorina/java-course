package ru.itpark.jdbc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.jdbcTemplate.HumansJdbcTemplateDaoImpl;
import ru.itpark.models.Human;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class HumansJdbcDaoImplTest {
    private HumansJdbcDaoImpl testedHumansJdbcDao;

    @Before
    public void setUp() throws Exception {
        String name = "postgres";
        String password = "passslon42";
        String url = "jdbc:postgresql://localhost:5432/Task14_db";
        Connection connection = DriverManager.getConnection(
                        url, name, password);
        testedHumansJdbcDao = new HumansJdbcDaoImpl();
    }

    @Test
    public void findHumanJdbc() {
        Human expected = Human.builder()
                .id(1)
                .name("Лейсан")
                .age(23)
                .citizen("Зеленодольск")
                .build();
        Human actual = testedHumansJdbcDao.find(1);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadUserId() {
        testedHumansJdbcDao.find(44);
    }
}