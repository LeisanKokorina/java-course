package ru.itpark.LinkedList;


public class LinkedList implements List {

    private Node head;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;

    }

    @Override
    public void addToBegin(int element) {
        Node newNode = new Node(element);
        if (head != null){
            newNode.next = head;
        }
        head = newNode;
        count++;
    }

    @Override
    public void addToEnd(int element) {
        Node newNode = new Node(element);
        Node current =  head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    @Override
    public void addByPosition(int position, int element) {
        Node previous = head;
        count = 1;
        while(count < position - 1){
            previous = previous.next;
            count++;
        }
        Node current = previous.next;

        Node newNode = new Node(element);
        previous.next = newNode;
        newNode.next = current;
    }

    @Override
    public void lengthOfList() {
        Node current = head;
        count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
    }

    @Override
    public void deleteByPosition(int position) {
        Node previous = head;
        count = 1;
        while (count < position - 1){
            previous = previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next = current.next;
        current.next = null;
    }

    @Override
    public void deleteByElement(int element) {

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
        public int next() {
            int element = currentNode.value;
            currentNode = currentNode.next;
            return element;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }
    private static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}





