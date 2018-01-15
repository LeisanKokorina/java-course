package ru.itpark.servlets;

import ru.itpark.models.Ticket;
import ru.itpark.models.Train;
import ru.itpark.repository.TicketRepository;
import ru.itpark.repository.TrainRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TicketJspServlet extends HttpServlet {
    private TicketRepository ticketRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.ticketRepository = (TicketRepository)config.getServletContext().getAttribute("ticketRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет!");
        req.setAttribute("tickets", ticketRepository.findAll());
        req.getRequestDispatcher("/jsp/ticket.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Long owner = Long.parseLong(req.getParameter("owner"));
        Long ownerDocument = Long.parseLong(req.getParameter("ownerDocument"));
        Long trainId = Long.parseLong(req.getParameter("trainId"));
        Long departure = Long.parseLong(req.getParameter("departureStationId"));
        Long arrival = Long.parseLong(req.getParameter("arrivalStationId"));
        int carriage = Integer.parseInt(req.getParameter("carriage"));
        int place = Integer.parseInt(req.getParameter("place"));

        Ticket ticket = Ticket.builder()
                .owner(owner)
                .ownerDocument(ownerDocument)
                .trainId(trainId)
                .departureStationId(departure)
                .arrivalStationId(arrival)
                .carriage(carriage)
                .place(place)
                .build();


        ticketRepository.save(ticket);
        resp.sendRedirect("/ticketSave");
    }
}


