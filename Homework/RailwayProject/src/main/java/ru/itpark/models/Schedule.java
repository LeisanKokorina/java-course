package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private Train train;
    private Station station;
    //timestamp -> java??
}
