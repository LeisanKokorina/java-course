package ru.itpark;

public class LinkedList implements ListForLinkedList {
    private Node head;
    private int count;

    public LinkedList() {
        this.count = 0;
        this.head = null;

    }


    @Override
    public void addToEnd(Object object) {
        Node newNode = new Node(object);

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
    public IteratorForLinkedList iterator() {
        return new LinkedListIterator();

    }

    private class LinkedListIterator implements IteratorForLinkedListList {
        private Node currentNode;

        LinkedListIterator() {
            currentNode = head;
        }

        @Override
        public Object next() {
            Object object = currentNode.object;
            currentNode = currentNode.next;
            return object;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }
    }
    private static class Node{
        private Object object;
        private Node next;

        public Node(Object object) {
            this.object = object;
            this.next = null;
        }
    }
}
