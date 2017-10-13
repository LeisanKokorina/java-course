package ru.itpark;



public class Channel extends TV {
    private Program programs[];
    private String channelsName;

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


}
