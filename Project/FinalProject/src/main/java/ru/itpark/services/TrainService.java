package ru.itpark.services;

import ru.itpark.forms.TrainForm;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.util.List;

public interface TrainService {
    List<Train> getTrains(String orderBy);
    List<Train> getTrains();
    void update(Long trainId, TrainForm form);
    Long addTrain(TrainForm form);

}
