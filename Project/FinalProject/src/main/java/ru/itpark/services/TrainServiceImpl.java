package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Train;
import ru.itpark.repositories.TrainRepository;

import java.util.List;
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
                .seatCount(form.getSeatCount())
                .build();
        trainRepository.save(newTrain);
        return newTrain.getId();
    }

    @Override
    public List<Train> getTrains(String orderBy) {
        switch (orderBy) {
            case "id":return trainRepository.findByOrderById();
            case "route_id": return trainRepository.findByOrderByRouteId();
            case "departure_date": return trainRepository.findByOrderByDepartureDate();
            case "fare": return trainRepository.findByOrderByFare();

        }
        return trainRepository.findAll();
    }

    @Override
    public Train getTrain(Long trainId) {
        return trainRepository.findOne(trainId);
    }
}
