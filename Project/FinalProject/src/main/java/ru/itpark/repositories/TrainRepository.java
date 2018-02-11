package ru.itpark.repositories;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface TrainRepository extends JpaRepository<Train, Long> {
    List<Train> findByOrderById();
    List<Train> findByOrderByTrainNumber();
    List<Train> findByRoutesAndDepartureDate(List<Route> routes, LocalDate departureDate);



}
