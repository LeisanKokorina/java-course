package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Station;

import java.util.List;

public interface StationRepository extends JpaRepository<Station, Long> {
    List<Station> findByOrderById();
    List<Station> findByOrderByName();

}
