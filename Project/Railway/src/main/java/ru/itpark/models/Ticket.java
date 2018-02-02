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
    @Enumerated(value = EnumType.STRING)
    private TicketStatus ticketStatus;

    private String firstName;
    private String middleName;
    private String lastName;
    private String document;


}
