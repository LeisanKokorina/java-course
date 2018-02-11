package ru.itpark.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "train")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String trainNumber;

    private String departure;
    private String destination;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate departureDate;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate arrivalDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;


    @OneToMany(mappedBy = "train")
    private List<Route> routes ;





}
