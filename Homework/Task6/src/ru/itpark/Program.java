package ru.itpark;

import java.time.LocalTime;

public class Program extends Channel {
    private String name;
    private LocalTime beginTime;
    private LocalTime endTime;

    public Program(Program[] programs, String channelsName, String name, LocalTime beginTime, LocalTime endTime) {
        super(programs, channelsName);
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
