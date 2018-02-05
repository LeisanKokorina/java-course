package ru.itpark.services;

import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;

public interface MainPageService {
    List<Train> findByRouteAndDate(Route route, LocalDate date);

}
