package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
@Data
@ToString
public class MainPageForm {
    private String origin;
    private String destination;
    private LocalDate departureDate;
}
