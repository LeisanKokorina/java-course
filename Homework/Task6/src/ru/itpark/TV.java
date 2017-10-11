package ru.itpark;

public class TV extends RemoteController{
    private Channel channels[];



    private final static TV singleTV;

    private TV() {
        System.out.println("TV on");
    }

    static {
        // создали объект
        singleTV = new TV();
    }

    public static TV getSingleTV() {
        return singleTV;
    }

    public TV(Channel[] channels) {
        this.channels = channels;
    }

    void showChannels(Channel[] channels){
        System.out.println("Список каналов");
        for(int i=0; i<channelsName.length;i++){
            System.out.println(channelsName[i].);
        }
    }
}
