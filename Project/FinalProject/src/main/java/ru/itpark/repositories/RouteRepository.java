package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.forms.MainPageForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findByOrderByPickUpPoint();
    List<Route> findByOrderByRoutePoint();
    List<Route> findByOrderById();
    List<Route> findByOrderByTrain();

    List<Route> findByPickUpPointAndRoutePointAndDepartureDate(String departure, String destination, LocalDate departureDate);

    Route findByTrainId(Long trainId);



}
