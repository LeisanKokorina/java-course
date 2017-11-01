package ru.itpark;

public class Main {

    public static void main(String[] args) {

        DataReader reader = new DataReader("HumanNames.txt");
        DataReader numbersReader = new DataReader("HumanNames.txt");

        ArrayList arrayList = new ArrayList();

        String name = reader.readString();
        int age = numbersReader.readInteger();

        Human human = new Human(name, age);
        arrayList.addByIndex(age,human);

        while (age != 0){
            name = reader.readString();
            age = numbersReader.readInteger();

            Human humans = new Human(name, age);
            arrayList.addByIndex(age, humans);
        }

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
