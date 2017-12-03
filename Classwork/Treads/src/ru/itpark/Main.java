package ru.itpark;

public class Main {

    public static void main(String[] args) throws Exception {
        FirstThread firstThread = new FirstThread();
        SecondTread secondTread = new SecondTread();
        Thread thread = Thread.currentThread();

        firstThread.start();
        secondTread.start();


        firstThread.join();
        secondTread.join();
        for(int i = 0; i< 100;i++){
            System.out.println("Человек");
        }

    }
}
