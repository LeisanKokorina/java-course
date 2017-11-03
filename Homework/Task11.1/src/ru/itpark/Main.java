package ru.itpark;

import java.io.IOException;

public class Main {


    public static void main(String[] args)throws IOException {

        DataReader reader = new DataReader("name.txt");
        DataReader numbersReader = new DataReader("name.txt");

        ArrayList arrayList = new ArrayList();

        String name = reader.readString();
        int age = numbersReader.readInteger();

        Human human = new Human(name, age);
        arrayList.addByIndex(human, age);

        while (age != 0){
            name = reader.readString();
            age = numbersReader.readInteger();

            Human humans = new Human(name, age);
            arrayList.addByIndex(humans, age);
        }
        arrayList.connect();
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
