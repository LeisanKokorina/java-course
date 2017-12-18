package ru.itpark;

import ru.itpark.dao.CarsDao;
import ru.itpark.dao.HumansDao;

public class Main {
    public static void main(String[] args) {
        CarsDao carsDao = ComponentsFactory.carsDao();
        System.out.println(carsDao.find(2));
        //HumansDao humansDao = ComponentsFactory.humansDao();
        //System.out.println(humansDao.find(2));
    }
}
