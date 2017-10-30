package ru.itpark;

public class LinkedList implements List {
    private Node head;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;

    }


    @Override
    public void addToEnd(String name) {
        Node newNode = new Node(name);

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
    public Iterator iterator() {
        return new LinkedListIterator();

    }

    private class LinkedListIterator implements Iterator {
        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public String next() {
            String name = currentNode.value;
            currentNode = currentNode.next;
            return name;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }
    private static class Node{
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }
    }
}

