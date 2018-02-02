package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;
import ru.itpark.services.RouteService;

import java.util.List;

@Controller
public class RouteController {
    @Autowired
    private RouteService service;

    @GetMapping(value = "/routes")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Route> routes = service.getRoutes(orderBy);
        model.addAttribute("routes", routes);
        return "routes_page";
    }
    @PostMapping(value = "/insertRoute")
    public String addRoute(@ModelAttribute RouteForm form,
                           @ModelAttribute("model") ModelMap model){
        Long newRouteId = service.addRoute(form);
        model.addAttribute("id",newRouteId);
        return "addition_route_success";
    }
    @GetMapping("/insertRoute")
    public String getRoutePage() {
        return "addition_route";
    }
}
