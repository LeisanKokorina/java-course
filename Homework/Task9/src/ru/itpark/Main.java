package ru.itpark;


public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(1);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());


            }

        }


    }

