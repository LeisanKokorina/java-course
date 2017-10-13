package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TV tv = TV.getSingleTV();
        RemoteController remoteController = new RemoteController();
       // Channel channel = new Channel(1)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Перед Вами пульт ДУ");
    }
}
