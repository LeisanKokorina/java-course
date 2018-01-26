package ru.itpark.models;

import lombok.*;

import javax.persistence.*;


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
    private int id;
    private String number;
//    @Column(name = "departure")
    private Long departure;
//    @Column(name = "arrival")
    private Long arrival;
}
