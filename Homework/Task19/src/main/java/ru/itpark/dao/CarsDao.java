package ru.itpark.dao;

import ru.itpark.models.Car;

import java.util.List;

public interface CarsDao extends CrudDao<Car> {
    List<Car> findAllByColor(String color);
}
