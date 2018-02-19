package ru.itpark.services;

import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.util.List;

public interface RouteService {
    List<Route> getRoutes(String orderBy);
    List<Route> getRoutes();
    void update(Long routeId, RouteForm form);
    List<Route> getRoute( RouteForm form);
    Long addRoute(Long trainId, RouteForm form);
    List<Train>  getTrain(RouteForm form);
    Route findRoute(Long routeId);

}
