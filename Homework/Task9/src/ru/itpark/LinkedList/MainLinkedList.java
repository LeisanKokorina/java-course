package ru.itpark.LinkedList;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addToEnd(9);
        linkedList.addToEnd(0);
        linkedList.addToEnd(4);
        linkedList.addToEnd(10);
        linkedList.addToEnd(1);
        linkedList.addToEnd(8);
        linkedList.addByPosition(5, 100);

        linkedList.reverseList();
        linkedList.deleteByPosition(2);


        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());


        }


    }
}
