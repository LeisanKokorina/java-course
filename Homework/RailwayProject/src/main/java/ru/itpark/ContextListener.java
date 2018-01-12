package ru.itpark;

import ru.itpark.repository.PassportRepository;
import ru.itpark.repository.PassportRepositoryEntityManagerImpl;
import ru.itpark.repository.UsersRepository;
import ru.itpark.repository.UsersRepositoryEntityManagerImpl;

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
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}