package ru.itpark.repositories;

import ru.itpark.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
  List<User> findAllByAgeAndCitizen(int age, String citizen);
}