package ru.itpark;

import java.time.LocalTime;

public class Channel extends TV {
    private Program programs[];
    private String channelsName;
    private LocalTime localTime = LocalTime.now();
    private int hour = localTime.getHour();



   // вызов конструктора класса-предка


    public Channel(Channel[] channels, Program[] programs, String channelsName) {
        super(channels);
        this.programs = programs;
        this.channelsName = channelsName;
    }

    public Program[] getPrograms() {
        return programs;
    }

    public String getChannelsName() {
        return channelsName;
    }

    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }

    public void setChannelsName(String channelsName) {
        this.channelsName = channelsName;
    }
}
