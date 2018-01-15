package ru.itpark.repository.impl;

import ru.itpark.models.Passport;
import ru.itpark.repository.PassportRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class PassportRepositoryEntityManagerImpl implements PassportRepository {
    private EntityManager entityManager;
    public PassportRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Passport> findAll() {
        return entityManager
                .createQuery( "from Passport passport order by passport.id", Passport.class)
                .getResultList();
    }

    @Override
    public void save(Passport model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Passport find(Long id) {
        TypedQuery query = entityManager.createQuery("from Passport passport where passport.id = :id", Passport.class);
        query.setParameter("id", id);
        return (Passport) query.getSingleResult();
    }

    @Override
    public void update(Passport model) {
        entityManager.getTransaction().begin();
        entityManager.merge(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Passport model = find(id);
        entityManager.getTransaction().begin();
        entityManager.remove(model);
        entityManager.getTransaction().commit();
    }
}
