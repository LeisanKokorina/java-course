package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.PassportForm;
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
    @Override
    public Long addPassport(PassportForm form) {
        Passport newPassport = Passport.builder()
                .number(form.getNumber())
                .build();
        passportRepository.save(newPassport);
        return newPassport.getId();
    }
}
