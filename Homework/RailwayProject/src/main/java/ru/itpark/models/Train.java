package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Train {
    private int id;
    private String trainNumber;
    private Station startStation;
    private Station arrivalStation;
}
