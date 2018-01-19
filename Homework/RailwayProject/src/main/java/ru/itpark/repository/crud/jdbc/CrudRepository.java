package ru.itpark.repository.crud.jdbc;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();

    void save(T model);


}