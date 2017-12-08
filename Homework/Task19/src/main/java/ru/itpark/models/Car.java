package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString (exclude = "owner")
@EqualsAndHashCode (exclude = "owner")
@Builder
public class Car {
    private int id;
    private String number;
    private String color;
    private String model;
    private Human owner;




}
