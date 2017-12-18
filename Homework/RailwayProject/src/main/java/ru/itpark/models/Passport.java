package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Passport {
    private int id;
    private String number;
    private Person owner;
}
