package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class TicketForm {
    private String firstName;
    private String middleName;
    private String lastName;
    private String document;
    private String pickUpPoint;
    private String routePoint;
    private int price;
    private String departureDate;
    private String arrivalDate;
    private String departureTime;
    private String arrivalTime;
    private Long trainId;
    //private Long userId;

//    private String firstName;
//    private String middleName;
//    private String lastName;
//    private String document;
//    //private String sex;
//    private String birthday;
}
