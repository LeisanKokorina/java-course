package ru.itpark.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


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
    private String firstName;
    private String middleName;
    private String lastName;
    private String document;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="route")
    private Route route;

   // private LocalDateTime buyTime;

    @Enumerated(value = EnumType.STRING)
    private TicketState ticketState;



//    @OneToOne(mappedBy = "ticket")
//    private Passenger passenger;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;






}
