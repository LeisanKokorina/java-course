package ru.itpark.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private Train train;
    private Station station;
    private LocalDateTime departure;
    private LocalDateTime arrival;
}
