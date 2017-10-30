package ru.itpark;

public class ArrayList implements ListForArrayList{
    private Object age[];
    private int count;


    public ArrayList() {
        this.age = new Object[100];
        this.count = 0;
    }

    @Override
    public void addToEnd(LinkedList linkedList) {
        age[count] = object;
        count++;
    }



    @Override
    public IteratorForArrayList iterator() {
        return new arrayListIteratorForArrayList();

    }

    private class arrayListIteratorForArrayList implements IteratorForArrayList {
        private int current;
        public arrayListIteratorForArrayList() {
            current = 0;
        }

        @Override
        public LinkedList next() {
             objList = age[current];
            current++;
            return linkedList;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }

}
