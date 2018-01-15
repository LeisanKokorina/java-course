package ru.itpark.servlets.Schedule;

import ru.itpark.models.Schedule;
import ru.itpark.repository.ScheduleRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

public class ScheduleJspServletSave extends HttpServlet{
    private ScheduleRepository scheduleRepository;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.scheduleRepository = (ScheduleRepository)config.getServletContext().getAttribute("scheduleRepository");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет!");
        req.setAttribute("schedules", scheduleRepository.findAll());
        req.getRequestDispatcher("/jsp/schedule.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Long trainId = Long.parseLong(req.getParameter("trainId"));
        Long stationId = Long.parseLong(req.getParameter("station"));
        LocalDateTime departureTime = LocalDateTime.parse("departureTime");
        LocalDateTime arrivalTime = LocalDateTime.parse("arrivalTime");


        Schedule schedule = Schedule.builder()
                .trainId(trainId)
                .station(stationId)
                .departureTime(departureTime)
                .arrivalTime(arrivalTime)
                .build();



        scheduleRepository.save(schedule);
        resp.sendRedirect("/scheduleSave");
    }
}
