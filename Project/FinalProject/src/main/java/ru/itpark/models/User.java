package ru.itpark.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
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
  private String surname;
  private String email;
  private String hashPassword;
  private LocalDateTime registrationTime;

  private String confirmCode;
  private LocalDateTime expiredDate;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Ticket> tickets;

  @Enumerated(value = EnumType.STRING)
  private State state;

  @Enumerated(value = EnumType.STRING)
  private Role role;


  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ticket_id")
  private Ticket ticket;
}