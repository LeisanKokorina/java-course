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

    public int getCount() {
        return count;
    }

    @Override
    public void addByIndex(Object element, int index) {
        Node newNode = new Node(element);
        Node current = head;
        Node next = current.next;
        if (index != 0) {
            for (int i = 0; i < index - 1; i++) {
                if (current.next != null) {
                    current = next;
                    next = current.next;
                }
            }
            current.next = newNode;
            newNode.next = next;
        } else {
            newNode.human = head.human;
            head.next = newNode;
            head.human = (Human) element;
            newNode.next = next;
        }
        count++;
    }

    @Override
    public void addToEnd(Object element) {
        Node newNode = new Node(element);
        //Node lastNode = null;
        LinkedListIterator iterator = new LinkedListIterator();
        while (iterator.hasNext()) {
            newNode = iterator.currentNode;
            iterator.next();
        }
        newNode.next = newNode;
        count++;
    }

    public void concat(LinkedList otherList) {
        Node lastNode = null ;
        LinkedListIterator iterator = new LinkedListIterator();
        if (head.human.getAge() != 0) {
            while (iterator.hasNext()) {
                lastNode = iterator.currentNode;
                iterator.next();
            }
            lastNode.next = otherList.getHead();//nullpointerexception
        } else {
            head = otherList.getHead();
            count--;
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
