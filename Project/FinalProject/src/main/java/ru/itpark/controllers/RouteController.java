package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.models.User;
import ru.itpark.services.AuthenticationService;
import ru.itpark.services.RouteService;

import java.util.List;

@Controller
public class RouteController {
    @Autowired
    private RouteService service;
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/routes")
    public String getRoutes(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Route> routes = service.getRoutes(orderBy);
        model.addAttribute("routes", routes);
        return "routes_page";
    }
    @PostMapping(value = "/insert/route")
    public String addRoute(@ModelAttribute RouteForm form,
                           @ModelAttribute("model") ModelMap model){

        Long newRouteId = service.addRoute(form.getTrainId(), form);
        model.addAttribute("id",newRouteId);
        return "addition_route_success";
    }
    @GetMapping("/insert/route")
    public String getRoutePage() {
        return "addition_route";
    }



    @PostMapping("/")
    public String getTrainByRoute(@ModelAttribute RouteForm form,Authentication authentication,
                                  @ModelAttribute("model") ModelMap model){
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }

        List<Train> trains = service.getTrain(form);

        List<Route> routes = service.getRoute(form);
        model.addAttribute("trains",trains );
        model.addAttribute("routes",routes);


        return "found_trains";
    }
//    @PostMapping(value = "/ticket")
//    public String getOrderPage(@ModelAttribute RouteForm form,
//                               @ModelAttribute("model") ModelMap model){
//        Route route=service.;
//        model.addAttribute("route", route);
//        return "passenger_info";
//
//    }

}
