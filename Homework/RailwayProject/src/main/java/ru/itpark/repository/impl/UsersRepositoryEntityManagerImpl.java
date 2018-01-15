package ru.itpark.repository.impl;


import ru.itpark.models.Person;
import ru.itpark.repository.UsersRepository;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsersRepositoryEntityManagerImpl implements UsersRepository {

    private EntityManager entityManager;

    public UsersRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Person> findAll() {
        return entityManager
                .createQuery( "from Person person order by person.id", Person.class)
                .getResultList();
    }

    @Override
    public void save(Person model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Person find(int id) {
        TypedQuery query = entityManager.createQuery("from Person person where person.id = :id", Person.class);
        query.setParameter("id", id);
        return (Person) query.getSingleResult();
    }

    @Override
    public void update(Person model) {

    }

    @Override
    public void delete(int id) {

    }
}