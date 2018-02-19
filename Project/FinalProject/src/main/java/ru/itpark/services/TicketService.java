package ru.itpark.services;

import org.springframework.stereotype.Service;
import ru.itpark.forms.NamesForm;
import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.forms.TicketForm;
import ru.itpark.models.Ticket;


public interface TicketService {
    Ticket addTicket(RouteForm routeForm,  NamesForm form);

}
