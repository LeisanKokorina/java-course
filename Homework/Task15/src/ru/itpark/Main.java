package ru.itpark;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<Object>();
        Human human1 = new Human("Лейсан", 23);
        Human human2 = new Human("Булат", 27);
        Human human3 = new Human("Адель", 17);
        hashSet.add(human1);
        hashSet.add(human2);
        hashSet.add(human3);


    }
}
