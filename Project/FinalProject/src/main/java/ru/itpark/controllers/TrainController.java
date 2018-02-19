package ru.itpark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Train;
import ru.itpark.services.TrainService;

import java.util.List;

@Controller
public class TrainController {
    @Autowired
    private TrainService service;

    @GetMapping(value = "/trains")
    public String getTrains(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy) {
        List<Train> trains = service.getTrains(orderBy);
        model.addAttribute("trains", trains);
        return "trains_page";
    }
    @PostMapping(value = "/insert/train")
    public String addTrain(@ModelAttribute TrainForm form,
                           @ModelAttribute("model") ModelMap model){
        Long newTrainId = service.addTrain(form);
        model.addAttribute("id",newTrainId);
        return "addition_train_success";
    }
    @GetMapping("/insert/train")
    public String getTrainPage() {
        return "addition_train";
    }



    @PostMapping("/trains/{train-id}")
    @ResponseBody
    public ResponseEntity<Object> updateTrain(@PathVariable("train-id") Long trainId,
                                             TrainForm form) {
        service.update(trainId, form);
        return ResponseEntity.accepted().build();
    }


    @GetMapping("/trains/{train-id}")
    public String getTrainPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("train-id") Long trainId) {
        Train train = service.getTrain(trainId);
        model.addAttribute("train", train);
        return "train_page";
    }



}
