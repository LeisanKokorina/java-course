package ru.itpark.repository.crud.jdbc.impl;

import ru.itpark.models.Train;
import ru.itpark.repository.crud.jdbc.TrainRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class TrainRepositoryEntityManagerImpl implements TrainRepository {
    private EntityManager entityManager;

    public TrainRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Train> findAll() {
        return entityManager
                .createQuery( "from Train train order by train.id", Train.class)
                .getResultList();
    }

    @Override
    public void save(Train model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Train find(Long id) {
        TypedQuery query = entityManager.createQuery("from Train train where train.id = :id", Train.class);
        query.setParameter("id", id);
        return (Train) query.getSingleResult();
    }


}
