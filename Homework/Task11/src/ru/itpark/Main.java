package ru.itpark;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader("Names.txt");
        DataReader numbersReader = new DataReader("Names.txt");

        LinkedList age[] = new LinkedList[100];
        for (int i = 0; i < age.length; i++) {
            age[i] = new LinkedList();

        }
        String word = reader.readString();
        int number = numbersReader.readInteger();
        age[number].addToEnd(word);
        while (number != 0) {

            word = reader.readString();
            number = numbersReader.readInteger();
            age[number].addToEnd(word);

        }
        for (int i = 1; i < age.length; i++) {
            age[i].addToEnd(String.valueOf(i));
        }
        for (int i = 0 ; i < age.length; i++) {
            Iterator iterator = age[i].iterator();
            while (iterator.hasNext()) {
                System.out.println(i + " " + iterator.next() );
            }
        }

    }
}
