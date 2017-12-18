package ru.itpark;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.itpark.dao.PersonDao;
import ru.itpark.jdbc.template.PersonJdbcTemplateDaoImpl;
import ru.itpark.models.Person;

import javax.sql.DataSource;

public class Main {
    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("context.xml");
    DataSource dataSource = context.getBean("dataSource",DataSource.class);
    PersonDao personDao = context.getBean("personDao",PersonJdbcTemplateDaoImpl.class);


    Person lilya = new Person(4,"Лиля", "Рашидовна","Залялиева");
    

}
