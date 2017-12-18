package ru.itpark.dao;

public interface CrudDao<T> {
    void save(T model);
    T find(int id);
    void update(T model);
    void delete(int id);
}
