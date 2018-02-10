package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.models.Route;
import ru.itpark.models.Train;

@Data
@ToString
public class RouteForm {
    private String pickUpPoint;
    private String routePoint;
    private Train train;

    public void update(Route route) {
        route.setPickUpPoint(this.pickUpPoint);
        route.setRoutePoint(this.routePoint);

    }
}
