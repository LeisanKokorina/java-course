package ru.itpark;

import java.io.IOException;

public class Main {


    public static void main(String[] args)throws IOException {

        DataReader reader = new DataReader("name.txt");
        DataReader numbersReader = new DataReader("name.txt");

        ArrayList arrayList = new ArrayList();

        String word = reader.readString();
        int number = numbersReader.readInteger();

        Human human = new Human(word, number);
        arrayList.addByIndex(human, number);

        while (number != 0 && human.getName()!= null){
            word = reader.readString();
            number = numbersReader.readInteger();

            Human humans = new Human(word, number);
            arrayList.addByIndex(humans, number);
        }
        arrayList.connect(arrayList.getElements());
        arrayList.printArray();


    }
    public static void printList(List list) {
        Iterator iterator = list.iterator();

        if (iterator.hasNext()) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
    }

}
