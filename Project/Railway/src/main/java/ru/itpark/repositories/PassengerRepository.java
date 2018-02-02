package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Passenger;

import java.util.List;

public interface PassengerRepository  extends JpaRepository<Passenger, Long> {
    List<Passenger> findByOrderById();
    List<Passenger> findByOrderByDocument();
}
