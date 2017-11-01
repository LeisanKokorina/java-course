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

    @Override
    public void add(Object element) {
        elements[count++] = (LinkedList) element;
    }
    @Override
    public void addByIndex(int index, Object element) {
        if(count < MAX_SIZE){
            elements[index].add(element);
        }else {
            System.err.println("Места нет");
        }

    }

    public void printArray() {
        Main.printList(elements[0]);
    }
    public void connect(){

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
