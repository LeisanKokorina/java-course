package ru.itpark.dao;

import ru.itpark.models.Person;

import java.util.List;

public interface PersonDao extends CrudDao<Person>{
   List<Person> findAll(String firstName, String middleName, String lastName);
}
