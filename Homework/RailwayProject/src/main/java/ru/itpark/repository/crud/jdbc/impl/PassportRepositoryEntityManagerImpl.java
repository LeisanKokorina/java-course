package ru.itpark.repository.crud.jdbc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.itpark.models.Passport;
import ru.itpark.repository.crud.jdbc.PassportRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class PassportRepositoryEntityManagerImpl implements PassportRepository {
    //language=SQL
    private static final String SQL_SELECT_ALL_PASSPORTS =
            "SELECT * FROM passport";

    @Autowired
    private JdbcTemplate template;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Passport> findAll() {
        return template.query(SQL_SELECT_ALL_PASSPORTS, (row, rowNumber) -> Passport.builder()
                .id(row.getLong("id"))
                .number(row.getString("name"))
                .build());
    }

    @Transactional
    public void save(Passport model) {
        //entityManager.getTransaction().begin();
        entityManager.persist(model);
        //entityManager.getTransaction().commit();
    }


}
