package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.PassengerForm;
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
    @Override
    public Long addPassenger(PassengerForm form) {
        Passenger newPassenger = Passenger.builder()
                .firstName(form.getFirstName())
                .middleName(form.getMiddleName())
                .lastName(form.getLastName())
                .documentId(form.getDocumentId())
                .build();
        passengerRepository.save(newPassenger);
        return newPassenger.getId();
    }
}
