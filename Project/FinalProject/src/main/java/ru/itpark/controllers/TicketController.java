package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.forms.NamesForm;
import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.forms.TicketForm;
import ru.itpark.models.Route;
import ru.itpark.models.Ticket;
import ru.itpark.models.User;
import ru.itpark.services.AuthenticationService;
import ru.itpark.services.TicketService;


@Controller
public class TicketController {
     @Autowired
     private AuthenticationService authenticationService;
     @Autowired
     private TicketService service;



//     @PostMapping(value = "/ticket")
//     public String getOrder(@ModelAttribute RouteForm routeForm, NamesForm form, Authentication authentication,
//                             @ModelAttribute("model") ModelMap model){
//          if (authentication != null) {
//               User user = authenticationService.getUserByAuthentication(authentication);
//               model.addAttribute("user", user);
//          }
//          Route route =
//          Ticket newTicket = service.addTicket( routeForm,  form);
//          model.addAttribute("ticket",newTicket);
//          return "ticket_page";
//     }

}
