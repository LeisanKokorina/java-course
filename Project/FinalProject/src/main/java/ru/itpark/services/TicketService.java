package ru.itpark.services;

import org.springframework.stereotype.Service;
import ru.itpark.models.Ticket;

@Service
public interface TicketService {
    Ticket getTicket(Long ticketId);
}
