package ru.itpark.servlets.Train;

import ru.itpark.models.Train;
import ru.itpark.repository.TrainRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TrainJspServletSave extends HttpServlet {
            private TrainRepository trainRepository;

        @Override
        public void init(ServletConfig config) throws ServletException {
            this.trainRepository = (TrainRepository)config.getServletContext().getAttribute("trainRepository");
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setAttribute("hello", "Привет!");
            req.setAttribute("trains", trainRepository.findAll());
            req.getRequestDispatcher("/jsp/train.jsp").forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("UTF-8");
            String number = req.getParameter("number");
            Long departure = Long.parseLong(req.getParameter("departure"));
            Long arrival = Long.parseLong(req.getParameter("arrival"));

            Train train = Train.builder()
                    .number(number)
                    .departure(departure)
                    .arrival(arrival)
                    .build();

            trainRepository.save(train);
            resp.sendRedirect("/trainSave");
        }
}


