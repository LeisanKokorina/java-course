package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import ru.itpark.models.Route;
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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate departureDate;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate arrivalDate;
    @DateTimeFormat(pattern = "hh:mm")
    private LocalTime departureTime;
    @DateTimeFormat(pattern = "hh:mm")
    private LocalTime arrivalTime;
   // private Set<Route> routes;

    public void update(Train train) {
        train.setTrainNumber(this.trainNumber);
        train.setDeparture(this.departure);
        train.setDestination(this.destination);

        train.setDepartureDate(this.departureDate);
        train.setDepartureTime(this.departureTime);
        train.setArrivalDate(this.arrivalDate);
        train.setArrivalTime(this.arrivalTime);


    }

   // private int seatCount;
}
