package ru.itpark.services;

import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;

import java.util.List;

public interface RouteService {
    List<Route> getRoutes(String orderBy);
    Route getRoute(Long routeId);
    Long addRoute(RouteForm form);
}
