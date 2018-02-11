package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
@ToString
public class MainPageForm {
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
    private List<Route> routes ;


}
