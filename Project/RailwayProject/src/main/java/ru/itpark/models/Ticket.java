package ru.itpark.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long owner;
    private Long ownerDocument;
    private Long trainId;
    private Long departureStationId;
    private Long arrivalStationId;
    private int carriage;
    private int place;

}
