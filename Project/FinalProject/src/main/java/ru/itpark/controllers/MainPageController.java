package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import ru.itpark.forms.MainPageForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.models.User;
import ru.itpark.services.AuthenticationService;

import ru.itpark.services.TrainService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private TrainService trainService;

    @GetMapping(value = "/")
    public String getMainPage(@ModelAttribute("model") ModelMap model,
     Authentication authentication) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        model.addAttribute("dateNow", formatForDateNow.format(dateNow));
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "main_page";
    }


    @PostMapping(value = "/")
    public String findRoute(@ModelAttribute MainPageForm form,
                            @ModelAttribute("model") ModelMap model) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
        model.addAttribute("dateNow", formatForDateNow.format(dateNow));
        List<Train> trains=trainService.findByRouteAndDate(Route.builder().build(), form.getDepartureDate());

        model.addAttribute("trains",trains);
        return "profile";
    }

}
