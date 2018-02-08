package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Route;

import java.util.List;
import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Long> {
    List<Route> findByOrderByPickUpPoint();
    List<Route> findByOrderByRoutePoint();
    List<Route> findByOrderById();



}
