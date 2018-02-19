package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import ru.itpark.models.Route;
import ru.itpark.models.Station;
import ru.itpark.models.Train;


import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Data
@ToString
public class TrainForm {
    private String trainNumber;
    private String departure;
    private String destination;

//    private String departureDate;
//
//    private String arrivalDate;
//
//    private String departureTime;
//
//    private String arrivalTime;
    private List<Route> routes;
    private List<Station> stations;

    public void update(Train train) {
        train.setTrainNumber(this.trainNumber);
        train.setDeparture(this.departure);
        train.setDestination(this.destination);

//        train.setDepartureDate(LocalDate.parse(this.departureDate));
//        train.setArrivalDate(LocalDate.parse(this.arrivalDate));
//        train.setDepartureTime(LocalTime.parse(this.getDepartureTime()));
//        train.setArrivalTime(LocalTime.parse(this.getArrivalTime()));


    }

   // private int seatCount;
}
