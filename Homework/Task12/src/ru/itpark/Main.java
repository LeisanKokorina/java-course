package ru.itpark;

public class Main {

    public static void main(String[] args) {

        LinkedList objectList = new LinkedList();
        DataReader reader = new DataReader("HumanNames.txt");
        DataReader numbersReader = new DataReader("HumanNames.txt");


        String name = reader.readString();
        int age = numbersReader.readInteger();

        ArrayList ageList = new ArrayList();
        for (int i = 0; i < ageList.iterator(); i++) {
            ageList = new LinkedList();

        }

        ageList[ageList].addToEnd(name);


    }

    }
}
