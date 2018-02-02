package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import ru.itpark.forms.RegistrationForm;

import ru.itpark.services.RegistrationService;

@Controller
public class RegistrationController {

  @Autowired
  private RegistrationService service;

  @PostMapping("/registration")
  public String registrationUser(@ModelAttribute RegistrationForm form,
                                 @ModelAttribute("model") ModelMap model) {
    String email = service.registration(form);
    model.addAttribute("email", email);
    return "success_user";
  }

  @GetMapping("/registration")
  public String getRegistrationPage() {
    return "registration_page";
  }

  @GetMapping("/confirm/{confirm-string}")
  public String getConfirmPage(
          @ModelAttribute("model") ModelMap model,
          @PathVariable("confirm-string") String confirmString) {
    boolean result = service.confirm(confirmString);
    model.addAttribute("result", result);
    return "registration_page_result";
  }
  @GetMapping("/login")
  public String login(
          @ModelAttribute("model") ModelMap model,
          @RequestParam(value = "error", required = false) Boolean error) {
    if (error != null) {
      model.addAttribute("error", true);
    } else {
      model.addAttribute("error", false);
    }
    return "login";
  }

}