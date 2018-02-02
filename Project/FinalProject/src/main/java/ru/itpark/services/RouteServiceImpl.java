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
    public List<Route> getRoutes(String orderBy) {
        switch (orderBy) {
            case "id": return routeRepository.findByOrderById();
            case "origin": return routeRepository.findByOrderByOrigin();
            case "destination": return routeRepository.findByOrderByDestination();

        }
        return routeRepository.findAll();
    }

    @Override
    public Long addRoute(RouteForm form) {
        Route newRoute = Route.builder()
                .origin(form.getOrigin())
                .destination(form.getDestination())
                .build();
        routeRepository.save(newRoute);
        return newRoute.getId();
    }

    @Override
    public Route getRoute(Long routeId) {
        return routeRepository.findOne(routeId);
    }
}
