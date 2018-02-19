package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.repositories.RouteRepository;
import ru.itpark.repositories.TrainRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private TrainRepository trainRepository;

    @Override
    public Route findRoute(Long routeId) {
        return routeRepository.findOne(routeId);
    }

    @Override
    public Long addRoute(Long trainId, RouteForm form) {
        Route newRoute = Route.builder()
                .pickUpPoint(form.getPickUpPoint())
                .routePoint(form.getRoutePoint())
                .price(form.getPrice())
                .departureDate(LocalDate.parse(form.getDepartureDate()))
                .departureTime(LocalTime.parse(form.getDepartureTime()))
                .arrivalDate(LocalDate.parse(form.getArrivalDate()))
                .arrivalTime(LocalTime.parse(form.getArrivalTime()))
                .train(trainRepository.findOne(trainId))
                .build();
        routeRepository.save(newRoute);
        return newRoute.getId();
    }

    @Override
    public List<Route> getRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public List<Route> getRoute( RouteForm form) {

        return routeRepository.findByPickUpPointAndRoutePointAndDepartureDate(form.getPickUpPoint(),
                form.getRoutePoint(),LocalDate.parse(form.getDepartureDate()));
    }

    @Override
    public List<Route> getRoutes(String orderBy) {
        switch (orderBy) {
            case "pickUpPoint": return routeRepository.findByOrderByPickUpPoint();
            case "id": return routeRepository.findByOrderById();
            case "routePoint": return routeRepository.findByOrderByRoutePoint();
            case "train": return routeRepository.findByOrderByTrain();
        }
        return routeRepository.findAll();
    }



    @Override
    public List<Train> getTrain(RouteForm form) {
        List<Route> routes = routeRepository.findByPickUpPointAndRoutePointAndDepartureDate(form.getPickUpPoint(),
                form.getRoutePoint(),LocalDate.parse(form.getDepartureDate()));

        return trainRepository.findByRoutes(routes);
    }


    @Override
    public void update(Long routeId, RouteForm form) {
        Route route = routeRepository.findOne(routeId);
        form.update(route);
        routeRepository.save(route);
    }


}
