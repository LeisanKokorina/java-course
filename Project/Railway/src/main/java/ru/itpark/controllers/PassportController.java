package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.models.Passport;
import ru.itpark.services.PassportService;

import java.util.List;
@Controller
public class PassportController {
    @Autowired
    private PassportService service;

    @GetMapping(value = "/passports")
    public String getStations(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy){
        List<Passport> passports = service.getPassports(orderBy);
        model.addAttribute("passports",passports);
        return "passports_page";
    }
}
