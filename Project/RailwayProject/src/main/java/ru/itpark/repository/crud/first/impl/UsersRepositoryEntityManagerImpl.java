package ru.itpark.repository.crud.first.impl;


import ru.itpark.models.Person;
import ru.itpark.repository.crud.first.UsersRepository;


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
    public Person find(Long id) {
        TypedQuery query = entityManager.createQuery("from Person person where person.id = :id", Person.class);
        query.setParameter("id", id);
        return (Person) query.getSingleResult();
    }

    @Override
    public void update(Person model) {
        entityManager.getTransaction().begin();
        entityManager.merge(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Person model = find(id);
        entityManager.getTransaction().begin();
        entityManager.remove(model);
        entityManager.getTransaction().commit();
    }
}