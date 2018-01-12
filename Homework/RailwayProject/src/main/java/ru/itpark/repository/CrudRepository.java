package ru.itpark.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();

    void save(T model);
    T find(int id);
    void update(T model);
    void delete(int id);
}