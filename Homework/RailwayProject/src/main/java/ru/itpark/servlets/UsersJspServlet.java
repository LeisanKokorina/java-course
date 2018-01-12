package ru.itpark.servlets;

import ru.itpark.models.Passport;
import ru.itpark.models.Person;

import ru.itpark.repository.PassportRepository;
import ru.itpark.repository.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersJspServlet extends HttpServlet {

    private UsersRepository usersRepository;
    private PassportRepository passportRepository;



    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository)config.getServletContext().getAttribute("usersRepository");
        this.passportRepository = (PassportRepository)config.getServletContext().getAttribute("passportRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет!");

        req.setAttribute("users", usersRepository.findAll());
        req.setAttribute("passport", passportRepository.findAll());
        req.getRequestDispatcher("/jsp/person.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String firstName = req.getParameter("first_name");
        String middleName = req.getParameter("middle_name");
        String lastName = req.getParameter("last_name");

        Long documentId = Long.parseLong(req.getParameter("document_id"));

        Person person = Person.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .documentId(documentId)
                .build();
        usersRepository.save(person);
        resp.sendRedirect("/person");
    }
}