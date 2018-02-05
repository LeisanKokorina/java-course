package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.repositories.TrainRepository;

import java.sql.SQLClientInfoException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TrainServiceImpl implements TrainService {
    @Autowired
    private TrainRepository trainRepository;

    @Override
    public Long addTrain(TrainForm form) {
        Train newTrain = Train.builder()
                .routeId(form.getRouteId())
                .trainNumber(form.getTrainNumber())
                .departureDate(form.getDepartureDate())
                .departureTime(form.getDepartureTime())
                .arrivalDate(form.getArrivalDate())
                .arrivalTime(form.getArrivalTime())
                .fare(form.getFare())
                .build();
        trainRepository.save(newTrain);
        return newTrain.getId();
    }


    @Override
    public List<Train> findByRouteAndDate(Route route, LocalDate date) {
        return trainRepository.findByRouteIdAndDepartureDate(route.getId(),date);


    }

    @Override
    public List<Train> getTrains(String orderBy) {
        switch (orderBy) {
            case "id":return trainRepository.findByOrderById();
            case "route_id": return trainRepository.findByOrderByRouteId();
            case "departure_date": return trainRepository.findByOrderByDepartureDate();
            case "fare": return trainRepository.findByOrderByFare();
            //case "route_id+date":return trainRepository.findByRouteIdAndDepartureDate(orderBy,);


        }
        return trainRepository.findAll();
    }

    @Override
    public Train getTrain(Long trainId) {
        return trainRepository.findOne(trainId);
    }
}
