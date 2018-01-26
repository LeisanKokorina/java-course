package ru.itpark.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "passenger")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;

    private Long documentId;
}
