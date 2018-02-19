package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.RouteForm;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.repositories.RouteRepository;
import ru.itpark.repositories.TrainRepository;

import java.sql.SQLClientInfoException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainRepository trainRepository;

    @Override
    public List<Train> findByRoutes(TrainForm form) {

        return trainRepository.findByRoutes(form.getRoutes());
    }

    @Override
    public Long addTrain(TrainForm form) {


        Train newTrain = Train.builder()
                .trainNumber(form.getTrainNumber())
                .departure(form.getDeparture())
                .destination(form.getDestination())
//                .departureDate(LocalDate.parse(form.getDepartureDate()))
//                .departureTime(LocalTime.parse(form.getDepartureTime()))
//                .arrivalDate(LocalDate.parse(form.getArrivalDate()))
//                .arrivalTime(LocalTime.parse(form.getArrivalTime()))
                .build();
        trainRepository.save(newTrain);
        return newTrain.getId();
    }



    @Override
    public List<Train> getTrains(String orderBy) {
        switch (orderBy) {
            case "train_number": return trainRepository.findByOrderByTrainNumber();
            case "id": return trainRepository.findByOrderById();


        }
        return trainRepository.findAll();
    }

    @Override
    public void update(Long trainId, TrainForm form) {
        Train train = trainRepository.findOne(trainId);
        form.update(train);
        trainRepository.save(train);
    }

    @Override
    public Train getTrain(Long trainId) {
        return trainRepository.findOne(trainId);
    }
}