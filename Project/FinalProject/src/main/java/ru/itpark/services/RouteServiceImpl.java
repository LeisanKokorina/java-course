package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;
import ru.itpark.repositories.RouteRepository;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Override
    public Long addRoute(RouteForm form) {
        Route newRoute = Route.builder()
                .pickUpPoint(form.getPickUpPoint())
                .routePoint(form.getRoutePoint())
                .build();
        routeRepository.save(newRoute);
        return newRoute.getId();
    }

    @Override
    public List<Route> getRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Route getRoute(Long routeId) {
        return routeRepository.findOne(routeId);
    }

    @Override
    public List<Route> getRoutes(String orderBy) {
        switch (orderBy) {
            case "pickUpPoint": return routeRepository.findByOrderByPickUpPoint();
            case "id": return routeRepository.findByOrderById();
            case "routePoint": return routeRepository.findByOrderByRoutePoint();
        }
        return routeRepository.findAll();
    }

    @Override
    public Long findRoute(RouteForm form) {
        Route route = Route.builder()
                .pickUpPoint(form.getPickUpPoint())
                .routePoint(form.getRoutePoint())
                .train(form.getTrain())
                .build();
        return route.getId();
    }

    @Override
    public void update(Long routeId, RouteForm form) {
        Route route = routeRepository.findOne(routeId);
        form.update(route);
        routeRepository.save(route);
    }
}
