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

public class PassportJspServlet extends HttpServlet {


    private PassportRepository passportRepository;
    private UsersRepository usersRepository;


    @Override
    public void init(ServletConfig config) throws ServletException {
        this.passportRepository = (PassportRepository)config.getServletContext().getAttribute("passportRepository");
        this.usersRepository = (UsersRepository)config.getServletContext().getAttribute("usersRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет!");

        req.setAttribute("passport", passportRepository.findAll());
        req.setAttribute("users", usersRepository.findAll());
        req.getRequestDispatcher("/jsp/passport.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String number = req.getParameter("number");
        Long personId =  Long.parseLong(req.getParameter("person_id"));
        Passport passport = Passport.builder()
                .number(number)
                .personId(personId)
                .build();


        passportRepository.save(passport);
        resp.sendRedirect("/passport");
    }
}