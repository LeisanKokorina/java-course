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

        if(head == null){
            head = newNode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public void addByPosition(int position, int element) {
        Node newNode = new Node(element);
        if(position > lengthOfList() || position < 1){
            System.err.println("Linked list is empty");
            head = newNode;
        }else {
            Node previous = head;
            count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node current = previous.next;

            // Node newNode = new Node(element);
            previous.next = newNode;
            newNode.next = current;
        }
    }

    @Override
    public int lengthOfList() {
        Node current = head;
        count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
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
    public void reverseList() {
        if(lengthOfList() == 0){
            System.err.println("Linked list is empty");
        }
        Node current = head;
        Node previous = null;
        Node next;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
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





