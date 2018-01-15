package ru.itpark.servlets.Station;

import ru.itpark.models.Station;
import ru.itpark.repository.StationRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StationJspServletSave extends HttpServlet {
    private StationRepository stationRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.stationRepository = (StationRepository)config.getServletContext().getAttribute("stationRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет!");
        req.setAttribute("stations", stationRepository.findAll());
        req.getRequestDispatcher("/jsp/station.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("stationName");

        Station station = Station.builder()
                .name(name)
                .build();


        stationRepository.save(station);
        resp.sendRedirect("/stationSave");
    }
}
