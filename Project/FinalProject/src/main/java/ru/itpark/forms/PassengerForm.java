package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class PassengerForm {
    private String firstName;
    private String middleName;
    private String lastName;
    private String document;
    private String sex;
    private String birthday;


}
