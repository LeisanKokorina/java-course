package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.models.Passenger;
import ru.itpark.repositories.PassengerRepository;

import java.util.List;
@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public List<Passenger> getPassengers(String orderBy) {
        switch (orderBy) {
            case "id": return passengerRepository.findByOrderById();
            case "documentId": return passengerRepository.findByOrderByDocumentId();
        }
        return passengerRepository.findAll();
    }
}
