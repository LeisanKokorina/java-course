package ru.itpark.services;


import ru.itpark.models.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> getPassengers(String orderBy);
}
