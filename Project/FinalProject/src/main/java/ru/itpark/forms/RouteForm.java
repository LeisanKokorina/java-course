package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;
import ru.itpark.models.Route;

@Data
@ToString
public class RouteForm {
    private String pickUpPoint;
    private String routePoint;

    public void update(Route route) {
        route.setPickUpPoint(this.pickUpPoint);
        route.setRoutePoint(this.routePoint);

    }
}
