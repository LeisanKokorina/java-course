package ru.itpark;

public class FirstThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i< 100;i++){
            System.out.println("курица");
        }

    }
}
