package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.models.Station;
import ru.itpark.services.StationService;

import java.util.List;

@Controller
public class StationsController {

    @Autowired
    private StationService service;

    @GetMapping(value = "/stations")
    public String getStations(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy){
        List<Station> stations = service.getStations(orderBy);
        model.addAttribute("stations",stations);
        return "stations_page";
    }
}
