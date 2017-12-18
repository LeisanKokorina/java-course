package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Station {
    private int id;
    protected String stationName;
}
