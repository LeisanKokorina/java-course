package ru.itpark.forms;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RouteForm {
    private String origin;
    private String destination;
}
