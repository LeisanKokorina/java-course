package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Route;

import java.util.List;
import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Long> {
   // List<String> findAllOrigin();
    List<Route> findByOrderByOrigin();
    List<Route> findByOrderByDestination();
    List<Route> findByOrderById();
    Optional<Route> findByOrigin(String origin);
    Optional<Route> findByDestination(String destination);



}
