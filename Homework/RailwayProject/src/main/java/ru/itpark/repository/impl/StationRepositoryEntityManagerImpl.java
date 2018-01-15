package ru.itpark.repository.impl;

import ru.itpark.models.Station;
import ru.itpark.models.Train;
import ru.itpark.repository.StationRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StationRepositoryEntityManagerImpl implements StationRepository {
    private EntityManager entityManager;
    public StationRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Station> findAll() {
        return entityManager
                .createQuery( "from Station station order by station.id", Station.class)
                .getResultList();
    }

    @Override
    public void save(Station model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Station find(int id) {
        TypedQuery query = entityManager.createQuery("from Station station where station.id = :id", Station.class);
        query.setParameter("id", id);
        return (Station) query.getSingleResult();
    }

    @Override
    public void update(Station model) {

    }

    @Override
    public void delete(int id) {

    }
}
