package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
@Data
@ToString
public class MainPageForm {
    private String origin;
    private String destination;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate departureDate;
}
