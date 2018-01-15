package ru.itpark.repository.impl;

import ru.itpark.models.Ticket;
import ru.itpark.repository.TicketRepository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class TicketRepositoryEntityManagerImpl implements TicketRepository{
    private EntityManager entityManager;

    public TicketRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Ticket> findAll() {
        return entityManager
                .createQuery( "from Ticket ticket order by ticket.id", Ticket.class)
                .getResultList();
    }

    @Override
    public void save(Ticket model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public Ticket find(Long id) {
        TypedQuery query = entityManager.createQuery("from Ticket ticket where ticket.id = :id", Ticket.class);
        query.setParameter("id", id);
        return (Ticket) query.getSingleResult();
    }

    @Override
    public void update(Ticket model) {
        entityManager.getTransaction().begin();
        entityManager.merge(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Ticket model = find(id);
        entityManager.getTransaction().begin();
        entityManager.remove(model);
        entityManager.getTransaction().commit();    }
}
