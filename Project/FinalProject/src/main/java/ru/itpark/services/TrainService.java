package ru.itpark.services;

import ru.itpark.forms.MainPageForm;
import ru.itpark.forms.TrainForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface TrainService {
    List<Train> getTrains(String orderBy);

    void update(Long trainId, TrainForm form);
    Long addTrain(TrainForm form);


    List<Train> findByRoutesAndDepartureDate(MainPageForm form);

}
