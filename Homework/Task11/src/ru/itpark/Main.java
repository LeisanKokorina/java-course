package ru.itpark;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader("namesList.txt");
        String word = reader.readString();
        DataReader numbersReader = new DataReader("namesList.txt");
        int number = numbersReader.readInteger();
        while (word.length() > 0 && number != 0) {
            System.out.println(word + " " + number);
            word = reader.readString();
            number = numbersReader.readInteger();
        }

        int age[] = new int[]



    }
}
