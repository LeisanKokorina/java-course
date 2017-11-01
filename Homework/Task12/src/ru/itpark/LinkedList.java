package ru.itpark;

public class LinkedList implements List {
    private Node head;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;

    }

    public Node getHead() {
        return head;
    }

    @Override
    public void add(Object element) {
        Node newNode = new Node(element);
        Node tail = null;
        LinkedListIterator iterator = new LinkedListIterator();
        while (iterator.hasNext()) {
            tail = iterator.currentNode;
            iterator.next();
        }
        tail.next = newNode;
        count++;
    }

    @Override
    public void addByIndex(int index, Object element) {
        Node newNode = new Node(element);
        if(index > lengthOfList() || index < 1){
            System.err.println("Linked list is empty");
            head = newNode;
        }else {
            Node previous = head;
            count = 1;
            while (count < index - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;


            previous.next = newNode;
            newNode.next = current;
        }
    }
    public int lengthOfList() {
        Node current = head;
        count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public void concat(LinkedList otherList) {
        Node tail = null;
        LinkedListIterator iterator = new LinkedListIterator();
        if (head.human.getAge() != 0) {
            while (iterator.hasNext()) {
                tail = iterator.currentNode;
                iterator.next();
            }
            tail.next = otherList.getHead();
        } else head = otherList.getHead();
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();

    }

    private class LinkedListIterator implements Iterator {
        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public Object next() {
            Object element = currentNode.human.getHuman();
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }
    private static class Node{
        private Human human;
        private Node next;

         Node(Object element) {
            this.human = (Human)element;
            this.next = null;
        }
    }
}
