package ru.itpark.repository.crud.jdbc.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.itpark.models.Schedule;
import ru.itpark.repository.crud.jdbc.ScheduleRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class ScheduleRepositoryEntityManagerImpl implements ScheduleRepository {
    //language=SQL
    private static final String SQL_SELECT_ALL_ENTRY =
            "SELECT * FROM schedule";

    @Autowired
    private JdbcTemplate template;

    @PersistenceContext
    private EntityManager entityManager;

    public List<Schedule> findAll() {
        return template.query(SQL_SELECT_ALL_ENTRY, (row, rowNumber) -> Schedule.builder()
                .id(row.getLong("id"))
                .trainId(row.getLong("trainId"))
                .station(row.getLong("station"))
                .arrivalTime(row.getTimestamp("arrivalTime"))
                .departureTime(row.getTimestamp("departureTime"))
                .build());
    }

    @Transactional
    public void save(Schedule model) {
        //entityManager.getTransaction().begin();
        entityManager.persist(model);
        //entityManager.getTransaction().commit();
    }


}
