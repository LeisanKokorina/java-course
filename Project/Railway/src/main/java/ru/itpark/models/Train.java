package ru.itpark.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;


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
    private int totalSeats;




}
