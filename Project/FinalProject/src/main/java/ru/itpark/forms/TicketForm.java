package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class TicketForm {
    private Long userId;
    private Long trainId;
    private Long routeId;
    private String date;
    private String time;
    private int seat;
}
