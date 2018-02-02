package ru.itpark.services;

import ru.itpark.forms.TrainForm;
import ru.itpark.models.Train;

import java.util.List;

public interface TrainService {
    List<Train> getTrains(String orderBy);
    Train getTrain(Long trainId);
    Long addTrain(TrainForm form);
}
