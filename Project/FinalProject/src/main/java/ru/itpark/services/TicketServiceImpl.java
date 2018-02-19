package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;
import ru.itpark.forms.NamesForm;
import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.forms.TicketForm;
import ru.itpark.models.*;
import ru.itpark.repositories.PassengerRepository;
import ru.itpark.repositories.TicketRepository;
import ru.itpark.repositories.TrainRepository;
import ru.itpark.repositories.UsersRepository;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private TrainRepository trainRepository;


    @Override
    public Ticket addTicket(RouteForm routeForm, NamesForm form) {
        Route route = Route.builder().pickUpPoint(routeForm.getPickUpPoint())
                .routePoint(routeForm.getRoutePoint())
                .departureDate(LocalDate.parse(routeForm.getDepartureDate()))
                .departureTime(LocalTime.parse(routeForm.getDepartureTime()))
                .arrivalDate(LocalDate.parse(routeForm.getArrivalDate()))
                .arrivalTime(LocalTime.parse(routeForm.getArrivalTime()))
                .train(trainRepository.findOne(routeForm.getTrainId()))
                .price(routeForm.getPrice()).build();

        User user = User.builder()
                .name(form.getName())
                .surname(form.getSurname())
                .build();
        Ticket newTicket = Ticket.builder()
                .route(route)
                .user(user)
                .ticketState(TicketState.NOT_PAID)
                .build();



        ticketRepository.save(newTicket);
        return newTicket;
    }
}
