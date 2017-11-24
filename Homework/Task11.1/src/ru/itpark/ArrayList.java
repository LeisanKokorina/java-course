package ru.itpark;

public class ArrayList implements List {
    private final static int MAX_SIZE = 100;
    private LinkedList elements[];

    private int count;


    public ArrayList() {
        this.elements = new LinkedList[MAX_SIZE];
        for (int i = 0; i < elements.length; i++){
            elements[i] = new LinkedList();
        }
        this.count = 0;
    }

    public LinkedList[] getElements() {
        return elements;
    }

    @Override
    public void addToEnd(Object element) {
        if (count == elements.length) {
            System.err.println("Нет места");

        } else {
            elements[count] = (LinkedList) element;
            count++;
        }
    }

    @Override
    public void addByIndex( Object element, int index) {
        elements[index].addToEnd(element);


    }



    public void printArray() {
        Main.printList(elements[0]);
    }
    public void connect(LinkedList elements[]){
        for(int i = 1; i < MAX_SIZE; i++){
            elements[0].concat(elements[i]);
        }
        for(int i = MAX_SIZE - 1; i > 0 ;i--){
            elements[i] = null;
        }

    }

    @Override
    public Iterator iterator() {
        return new arrayListIterator();

    }

    private class arrayListIterator implements Iterator {
        private int current;
        public arrayListIterator() {
            current = 0;
        }

        @Override
        public Object next() {
            Object element = elements[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }

}
