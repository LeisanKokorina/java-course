package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.models.Passport;
import ru.itpark.repositories.PassportRepository;

import java.util.List;
@Service
public class PassportServiceImpl implements PassportService {
    @Autowired
    private PassportRepository passportRepository;

    @Override
    public List<Passport> getPassports(String orderBy) {
        switch (orderBy) {
            case "id": return passportRepository.findByOrderById();
            case "number": return passportRepository.findByOrderByNumber();
        }
        return passportRepository.findAll();

    }
}
