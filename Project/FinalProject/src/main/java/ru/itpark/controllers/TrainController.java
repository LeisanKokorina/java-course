package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Train;
import ru.itpark.services.TrainService;

import java.util.List;

@Controller
public class TrainController {
    @Autowired
    private TrainService service;

    @GetMapping(value = "/trains")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Train> trains = service.getTrains(orderBy);
        model.addAttribute("trains", trains);
        return "trains_page";
    }
    @PostMapping(value = "/insertTrain")
    public String addTrain(@ModelAttribute TrainForm form,
                           @ModelAttribute("model") ModelMap model){
        Long newTrainId = service.addTrain(form);
        model.addAttribute("id",newTrainId);
        return "addition_train_success";
    }
    @GetMapping("/insertTrain")
    public String getTrainPage() {
        return "addition_train";
    }
}
