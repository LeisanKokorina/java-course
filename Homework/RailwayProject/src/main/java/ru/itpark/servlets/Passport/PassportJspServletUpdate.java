package ru.itpark.servlets.Passport;

import ru.itpark.models.Passport;
import ru.itpark.repository.PassportRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PassportJspServletUpdate extends HttpServlet {


    private PassportRepository passportRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.passportRepository = (PassportRepository)config.getServletContext().getAttribute("passportRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getRequestURI());
        req.setAttribute("passport", passportRepository.find(id));
        System.out.println(passportRepository.find(id).getNumber());
        req.getRequestDispatcher("/jsp/updatePassport.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String number = req.getParameter("number");

        Passport passport = Passport.builder()
                .number(number)
                .build();


        passportRepository.update(passport);
        resp.sendRedirect("/passportUpdate");
    }
}