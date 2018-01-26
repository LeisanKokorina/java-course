package ru.itpark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.models.Passport;

import java.util.List;

public interface PassportRepository extends JpaRepository<Passport, Long> {
    List<Passport> findByOrderById();
    List<Passport> findByOrderByNumber();
}
