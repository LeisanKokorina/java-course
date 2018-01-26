package ru.itpark.servlets.Person;


import ru.itpark.models.Person;
import ru.itpark.repository.crud.first.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersJspServletUpdate extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository) config.getServletContext().getAttribute("usersRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getRequestURI());
        req.setAttribute("person", usersRepository.find(id));
        System.out.println(usersRepository.find(id).getFirstName());
        System.out.println(usersRepository.find(id).getMiddleName());
        System.out.println(usersRepository.find(id).getLastName());

        req.getRequestDispatcher("/jsp/updatePerson.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String firstName = req.getParameter("firstName");
        String middleName = req.getParameter("middleName");
        String lastName = req.getParameter("lastName");
        Long documentId = Long.parseLong(req.getParameter("documentId"));

        Person person = Person.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .documentId(documentId)
                .build();
        usersRepository.update(person);
        resp.sendRedirect("/personSave");
    }
}