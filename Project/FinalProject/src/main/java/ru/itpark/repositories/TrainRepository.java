package ru.itpark.repositories;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;

public interface TrainRepository extends JpaRepository<Train, Long> {
    List<Train> findByOrderById();
    List<Train> findByOrderByTrainNumber();
   // List<Train> getTrainsByDepartureDateAndRouteList()

}
