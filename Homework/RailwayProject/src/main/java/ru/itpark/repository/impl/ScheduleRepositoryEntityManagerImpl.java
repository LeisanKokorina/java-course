package ru.itpark.repository.impl;

import ru.itpark.models.Schedule;
import ru.itpark.repository.ScheduleRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ScheduleRepositoryEntityManagerImpl implements ScheduleRepository {
    private EntityManager entityManager;
    public ScheduleRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Schedule> findAll() {
        return entityManager
                .createQuery( "from Schedule schedule order by schedule.id", Schedule.class)
                .getResultList();
    }

    @Override
    public void save(Schedule model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Schedule find(Long id) {
        TypedQuery query = entityManager.createQuery("from Schedule schedule where schedule.id = :id", Schedule.class);
        query.setParameter("id", id);
        return (Schedule) query.getSingleResult();
    }

    @Override
    public void update(Schedule model) {
        entityManager.getTransaction().begin();
        entityManager.merge(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Schedule model = find(id);
        entityManager.getTransaction().begin();
        entityManager.remove(model);
        entityManager.getTransaction().commit();
    }
}
