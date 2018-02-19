package ru.itpark.models;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "route")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = "train")
@Builder
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pickUpPoint;
    private String routePoint;
    private int price;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate departureDate;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate arrivalDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="train_id")
    private Train train;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Ticket> tickets;

//    @Override
//    public String toString() {
//        return "Route{" +
//                "id=" + id +
//                ", pickUpPoint='" + pickUpPoint +", routePoint='" + routePoint+
//                ", price='" + price+", departureDate='" + departureDate+", departureTime='" + departureTime+
//                ", arrivalDate='" + arrivalDate+
//                ", arrivalTime='" + arrivalTime+
//
//        '\'' +
//                ", train=" + train.getTrainNumber() +
//                '}';
//    }


}
