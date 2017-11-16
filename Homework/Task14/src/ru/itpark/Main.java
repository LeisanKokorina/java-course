package ru.itpark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.dao.HumanDao;
import ru.itpark.jdbc.template.HumanDaoJdbcTemplate;
import ru.itpark.models.Human;

public class Main {

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("passslon42");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Task14_db");

        HumanDao humanDao = new HumanDaoJdbcTemplate(dataSource);

        Human leisan = new Human("Лейсан", 23,"Зеленодольск");

        humanDao.save(leisan);
        System.out.println(leisan);

    }
}
