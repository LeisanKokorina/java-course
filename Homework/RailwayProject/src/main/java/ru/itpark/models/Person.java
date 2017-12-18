package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
   // private Passport passport;
}
