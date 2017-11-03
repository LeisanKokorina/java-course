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

    public void concat(LinkedList otherList) {
        Node tail = null;
        //Node headOtherList = otherList.getHead();
        LinkedListIterator iterator = new LinkedListIterator();
        if (head.human.getAge() != 0) {
            while (iterator.hasNext()) {
                tail = iterator.currentNode;
                iterator.next();
            }
            tail.next = otherList.getHead();
        }else {
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
