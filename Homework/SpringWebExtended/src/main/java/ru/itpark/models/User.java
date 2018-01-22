package ru.itpark.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String citizen;
}