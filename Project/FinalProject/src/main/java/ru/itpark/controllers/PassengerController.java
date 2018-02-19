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



    @PostMapping("/insertPassengers")
    public String addPassenger(@ModelAttribute PassengerForm form,
                                        @ModelAttribute("model") ModelMap model){
        Long newPassengerId = service.addPassenger(form);

        model.addAttribute("id", newPassengerId);
        return "order";
    }
    @GetMapping("/insertPassengers")
    public String getPassengerPage() {
        return "passengers_info";
    }
}
