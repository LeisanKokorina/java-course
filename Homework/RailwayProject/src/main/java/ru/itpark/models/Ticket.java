package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private int id;
    private Person owner;
    private Passport ownerDocument;
    private Train train;
    private Station fromStation;
    private Station toStation;
    private int carriage;
    private int place;

}
