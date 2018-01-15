package ru.itpark;

import ru.itpark.repository.*;
import ru.itpark.repository.impl.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");


        UsersRepository usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);
        PassportRepository passportRepository = new PassportRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("passportRepository", passportRepository);

        TrainRepository trainRepository = new TrainRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("trainRepository", trainRepository);

        StationRepository stationRepository = new StationRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("stationRepository", stationRepository);

        TicketRepository ticketRepository = new TicketRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("ticketRepository", ticketRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}