package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.forms.PassengerForm;
import ru.itpark.models.Passenger;
import ru.itpark.services.PassengerService;

import java.util.List;
@Controller
public class PassengerController {
    @Autowired
    private PassengerService service;

    @GetMapping(value = "/passengers")
    public String getStations(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy){
        List<Passenger> passengers = service.getPassengers(orderBy);
        model.addAttribute("passengers",passengers);
        return "passengers_page";
    }
    @PostMapping("/insertPassengers")
    public String registrationPassenger(@ModelAttribute PassengerForm form,
                                        @ModelAttribute("model") ModelMap model){
        Long newPassengerId = service.addPassenger(form);
        model.addAttribute("id", newPassengerId);
        return "success_passenger";
    }
    @GetMapping("/insertPassengers")
    public String getPassengerPage() {
        return "passengers_submission";
    }
}
