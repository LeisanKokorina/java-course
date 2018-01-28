package ru.itpark.services;

import ru.itpark.forms.StationForm;
import ru.itpark.models.Station;

import java.util.List;

public interface StationService {
    List <Station> getStations (String orderBy);
    Long addStation(StationForm form);
}
