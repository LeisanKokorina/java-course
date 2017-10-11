package ru.itpark;

public class TV extends RemoteController{
    private Channel channels[];
    private final static TV sony;

    private TV() {
        System.out.println("TV sony is created");
    }

    static {
        // создали объект
        sony = new TV();
    }

    public static TV getInstance() {
        return sony;
    }
}
