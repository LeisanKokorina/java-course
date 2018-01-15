package ru.itpark.servlets.Station;

import ru.itpark.models.Station;
import ru.itpark.repository.StationRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StationJspServletUpdate extends HttpServlet {
    private StationRepository stationRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.stationRepository = (StationRepository)config.getServletContext().getAttribute("stationRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getRequestURI());
        req.setAttribute("station", stationRepository.find(id));
        System.out.println(stationRepository.find(id).getName());
        req.getRequestDispatcher("/jsp/updateStation.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("stationName");

        Station station = Station.builder()
                .name(name)
                .build();


        stationRepository.update(station);
        resp.sendRedirect("/stationUpdate");
    }
}
