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
@Data
@ToString
public class TrainForm {
    private String trainNumber;
  //  private Long routeId;
  //  private int fare;
    private String departure;
    private String destination;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate departureDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate arrivalDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
   // private List<Route> routeList;

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
