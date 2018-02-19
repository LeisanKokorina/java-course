package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@ToString
public class RouteForm {
    private String pickUpPoint;
    private String routePoint;
    private int price;
    private String departureDate;

    private String arrivalDate;

    private String departureTime;
    private Long trainId;
    private String arrivalTime;

    public void update(Route route) {
        route.setPickUpPoint(this.pickUpPoint);
        route.setRoutePoint(this.routePoint);
        route.setDepartureDate(LocalDate.parse(this.departureDate));
        route.setArrivalDate(LocalDate.parse(this.arrivalDate));
        route.setDepartureTime(LocalTime.parse(this.departureTime));
        route.setArrivalTime(LocalTime.parse(this.arrivalTime));

    }
}
