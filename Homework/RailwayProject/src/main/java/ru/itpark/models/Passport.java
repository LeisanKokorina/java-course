package ru.itpark.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "passport")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    @Column(name = "person_id")
    private Long personId;
 //   @OneToOne (cascade = CascadeType.ALL, mappedBy = "passport")
}
