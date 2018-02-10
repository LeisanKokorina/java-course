package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import ru.itpark.forms.TrainForm;
import ru.itpark.models.Train;
import ru.itpark.models.User;
import ru.itpark.services.AuthenticationService;

import java.util.List;


@Controller
public class MainPageController {
    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String getMainPage(Authentication authentication,
                              @ModelAttribute("model") ModelMap model) {
        if (authentication != null) {
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }

        return "main_page";
    }




}
