package ru.itpark.jdbc.template;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.models.Car;

public class CarJdbcTemplateDaoImplTest {
    private CarsJdbcTemplateDaoImpl testedCarsDao;
    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("passslon42");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Task14_db");
        testedCarsDao = new CarsJdbcTemplateDaoImpl(dataSource);
    }

    @Test
    public void findCarJdbcTemplate() throws Exception {
        Car expected = Car.builder()
                .id(1)
                .number("123")
                .model("toyota")
                .color("grey")
                .build();
        Car actual = testedCarsDao.find(1);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadId(){
        testedCarsDao.find(33);
    }

}