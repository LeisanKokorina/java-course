package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.models.Route;
import ru.itpark.models.Train;
import ru.itpark.repositories.TrainRepository;

import java.time.LocalDate;
import java.util.List;
@Service
public class MainPageServiceImpl implements MainPageService {
    @Autowired
    private TrainRepository trainRepository;
    @Override
    public List<Train> findByRouteAndDate(Route route, LocalDate date) {
        return trainRepository.findByRouteIdAndDepartureDate(route.getId(),date);


    }
}
