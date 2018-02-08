package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Ticket;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByOrderByUser();

}
