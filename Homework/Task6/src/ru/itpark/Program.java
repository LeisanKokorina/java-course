package ru.itpark;

import java.time.LocalTime;

public class Program extends Channel {
    private String programsName;
    private LocalTime beginTime;
    private LocalTime endTime;


    public Program(Channel[] channels, Program[] programs, String channelsName, String programsName, LocalTime beginTime, LocalTime endTime) {
        super(channels, programs, channelsName);
        this.programsName = programsName;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getProgramsName() {
        return programsName;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
