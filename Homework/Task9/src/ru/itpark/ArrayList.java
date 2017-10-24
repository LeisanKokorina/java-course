package ru.itpark;


public class ArrayList implements List {
    private final static int MAX_SIZE = 10;
    private int count;
    int[] array;

    public ArrayList() {
        this.count = 0;
        this.array = new int[MAX_SIZE];
    }

    @Override
    public void add(int element) {
        if (count == array.length) {
            System.err.println("Нет места");

        } else {
            array[count] = element;
            count++;
        }
    }

    @Override
    public void delete(int index) {
        if (count == 0) {
            System.err.println("Список пуст");
        } else {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
        }
    }

    @Override
    public int returnIndex(int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index = i;
            } else {
                System.err.println("Такого элемента нет");
            }
        }
        return index;
    }

    @Override
    public void addByIndex(int index, int element) {
        for (int i = 0; i < array.length; i++) {
            array[index] = element;

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
        public int next() {
            int element = array[current];
            current++;
            return element;
        }

        @Override
        public boolean hasNext() {
            return current < count;
        }
    }
}





