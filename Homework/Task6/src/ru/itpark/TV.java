package ru.itpark;

public class TV {
    private Channel channels[];
   // Channel channel = new Channel(1)

    public TV(Channel[] channels) {
        this.channels = channels;
    }

    public Channel[] getChannels() {
        return channels;
    }

    private final static TV singleTV;

    private TV() {
        System.out.println("TV here");
    }

    static {

        singleTV = new TV();
    }

    public static TV getSingleTV() {

        return singleTV;
    }




}
