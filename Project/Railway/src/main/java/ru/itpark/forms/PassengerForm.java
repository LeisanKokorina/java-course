package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PassengerForm {
    private String firstName;
    private String middleName;
    private String lastName;

    private Long documentId;
}
