package ru.itpark.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.forms.StationForm;
import ru.itpark.models.Station;
import ru.itpark.repositories.StationRepository;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationRepository stationRepository;

    @Override
    public List<Station> getStations(String orderBy) {
        switch (orderBy) {
            case "id": return stationRepository.findByOrderById();
            case "name": return stationRepository.findByOrderByName();
        }
        return stationRepository.findAll();
    }
    @Override
    public Long addStation(StationForm form) {
        Station newStation = Station.builder()
                .name(form.getName())
                .build();
        stationRepository.save(newStation);
        return newStation.getId();
    }
}
