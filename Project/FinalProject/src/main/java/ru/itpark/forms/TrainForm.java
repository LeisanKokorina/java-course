package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
@ToString
public class TrainForm {
    private String trainNumber;
    private Long routeId;
    private int fare;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
   // private int seatCount;
}
