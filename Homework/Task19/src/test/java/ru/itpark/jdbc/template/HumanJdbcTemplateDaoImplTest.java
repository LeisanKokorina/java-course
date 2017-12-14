package ru.itpark.jdbc.template;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.models.Human;

public class HumanJdbcTemplateDaoImplTest {
    private HumansJdbcTemplateDaoImpl testedHumansDao;

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("passslon42");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Task14_db");
        testedHumansDao = new HumansJdbcTemplateDaoImpl(dataSource);
    }

    @Test
    public void findHumanJdbcTemplate() throws Exception {
        Human expected = Human.builder()
                .id(1)
                .name("Лейсан")
                .age(23)
                .citizen("Зеленодольск")
                .build();
        Human actual = testedHumansDao.find(1);
        Assert.assertEquals(expected, actual);
    }

    // тест не провален, если снегерировал исключение на
    // плохом id
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadUserId() {
        testedHumansDao.find(44);
    }
}