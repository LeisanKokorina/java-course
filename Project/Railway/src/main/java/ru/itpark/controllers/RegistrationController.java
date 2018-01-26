package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itpark.forms.PassengerForm;
import ru.itpark.forms.PassportForm;
import ru.itpark.forms.RegistrationForm;
import ru.itpark.forms.StationForm;
import ru.itpark.services.RegistrationService;

@Controller
public class RegistrationController {

  @Autowired
  private RegistrationService service;

  @PostMapping("/registration")
  public String registrationUser(@ModelAttribute RegistrationForm form,
                                 @ModelAttribute("model") ModelMap model) {
    Long newUserId = service.registration(form);
    model.addAttribute("id", newUserId);
    return "success_user";
  }

  @GetMapping("/registration")
  public String getRegistrationPage() {
    return "registration_page";
  }



  @PostMapping("/insertStations")
  public String registrationStation(@ModelAttribute StationForm form,
                                    @ModelAttribute("model") ModelMap model){
    Long newStationId = service.addStation(form);
    model.addAttribute("id", newStationId);
    return "success_station";
  }
  @GetMapping("/insertStations")
  public String getStationPage() {
    return "stations_submission";
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


  @PostMapping("/insertPassports")
  public String registrationPassport(@ModelAttribute PassportForm form,
                                      @ModelAttribute("model") ModelMap model){
    Long newPassportId = service.addPassport(form);
    model.addAttribute("id", newPassportId);
    return "success_passport";
  }
  @GetMapping("/insertPassports")
  public String getPassportPage() {
    return "passports_submission";
  }

}