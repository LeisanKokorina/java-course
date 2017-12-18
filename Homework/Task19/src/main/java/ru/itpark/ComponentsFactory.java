package ru.itpark;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.dao.CarsDao;
import ru.itpark.dao.HumansDao;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class ComponentsFactory {

    private final static ComponentsFactory componentsFactory;

    private Properties properties;

    static {
        componentsFactory = new ComponentsFactory();
    }

    private ComponentsFactory() {
        properties = new Properties();
        try {
            properties.load(new FileReader("E:\\Java\\JAVA_IT_PARK_3\\Homework\\Task19\\src\\main\\resources\\application.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername(properties.getProperty("datasource.name"));
        dataSource.setPassword(properties.getProperty("datasource.password"));
        dataSource.setUrl(properties.getProperty("datasource.url"));
        dataSource.setDriverClassName(properties.getProperty("datasource.driver"));
        return dataSource;
    }

    private CarsDao carsDao0() {
        try {
            Class<CarsDao> carsDaoClass = (Class<CarsDao>)Class.forName(properties.getProperty("dao.cars.classname"));
            Constructor<CarsDao> carsDaoConstructor =
                    carsDaoClass.getConstructor(DataSource.class);
            return carsDaoConstructor.newInstance(dataSource());
        } catch (ReflectiveOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static CarsDao carsDao() {
        return componentsFactory.carsDao0();
    }

    private HumansDao humansDao0(){
        try {
            Class<HumansDao> humansDaoClass = (Class<HumansDao>)Class.forName(properties.getProperty("dao.humans.classname"));
            Constructor<HumansDao> humansDaoConstructor = humansDaoClass.getConstructor(DataSource.class);
            return humansDaoConstructor.newInstance(dataSource());

        }catch (ReflectiveOperationException e){
            throw new IllegalArgumentException(e);
        }
    }
    public static HumansDao humansDao(){
        return componentsFactory.humansDao0();
    }
}