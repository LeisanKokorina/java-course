package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itpark.models.Ticket;
import ru.itpark.repositories.TicketRepository;

public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public Ticket getTicket(Long ticketId) {
        return ticketRepository.findOne(ticketId) ;
    }
}
