package ru.itpark.services;


import ru.itpark.forms.PassportForm;
import ru.itpark.models.Passport;

import java.util.List;

public interface PassportService {
    List<Passport> getPassports(String orderBy);
    Long addPassport(PassportForm form);
}
