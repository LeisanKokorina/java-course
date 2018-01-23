package ru.itpark.repository.crud.first;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();

    void save(T model);
    T find(Long id);
    void update(T model);
    void delete(Long id);
}