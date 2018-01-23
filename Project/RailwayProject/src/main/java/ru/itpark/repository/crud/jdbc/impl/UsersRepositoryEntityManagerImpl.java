package ru.itpark.repository.crud.jdbc.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.itpark.models.Person;
import ru.itpark.repository.crud.jdbc.UsersRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class UsersRepositoryEntityManagerImpl implements UsersRepository {

    //language=SQL
    private static final String SQL_SELECT_ALL_USERS =
            "SELECT * FROM person";

    @Autowired
    private JdbcTemplate template;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, (row, rowNumber) -> Person.builder()
                .id(row.getLong("id"))
                .firstName(row.getString("firstName"))
                .middleName(row.getString("middleName"))
                .lastName(row.getString("lastName"))
                .documentId(row.getLong("documentId"))
                .build());
    }

    @Transactional
    public void save(Person model) {
        //entityManager.getTransaction().begin();
        entityManager.persist(model);
        //entityManager.getTransaction().commit();
    }


}