package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Car car = Car.builder()
                .model("Toyota")
                .topSpeed(250)
                .build();
    }
}
