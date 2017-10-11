package ru.itpark;

public class Channel extends TV {
    private Program programs[];

    public Channel(Program[] programs) {
        this.programs = programs;
    }

    public Program[] getPrograms() {
        return programs;
    }
}
