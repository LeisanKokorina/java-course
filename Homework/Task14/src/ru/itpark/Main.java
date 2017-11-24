package ru.itpark;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.dao.CarDao;
import ru.itpark.dao.HumanDao;
import ru.itpark.jdbc.template.CarJdbcTemplateDaoImpl;
import ru.itpark.jdbc.template.HumanJdbcTemplateDaoImpl;
import ru.itpark.models.Car;
import ru.itpark.models.Human;

public class Main {

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("passslon42");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Task14_db");

        HumanDao humanDao = new HumanJdbcTemplateDaoImpl(dataSource);
        CarDao carDao = new CarJdbcTemplateDaoImpl(dataSource);
        Human leisan = new Human("Лейсан", 23,"Зеленодольск");
        Car opel = new Car("555", "yellow", "Astra", 1 );

        humanDao.save(leisan);
        carDao.save(opel);
        System.out.println(leisan);
        System.out.println(opel);

    }
}
