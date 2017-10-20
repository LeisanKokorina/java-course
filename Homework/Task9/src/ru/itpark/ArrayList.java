package ru.itpark;


public class ArrayList implements List, Iterator {
    private int count = 0;
    int[] array = new int[10];

    @Override
    public void add(int element) {
        if (count == array.length) {
            System.err.println("Нет места");

        }else{
            array[count] = element;
            count++;
        }
    }

    @Override
    public void delete(int index) {
        if(count == 0){
            System.err.println("Список пуст");
        }else{
            for(int i = index; i < array.length-1; i++){
                array[i] = array[i+1];
            }
        }
    }

    @Override
    public int returnIndex(int element) {
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(element == array[i]){
                 index = i;
            }else{
                System.err.println("Такого элемента нет");
            }
        }
        return index;
    }

    @Override
    public void addByIndex( int index, int element) {
        for (int i = 0; i < array.length; i++){
            array[index] = element;

        }
    }

    @Override
    public void returnObject() {

    }

    @Override
    public int next() {
        return 0;
    }

    @Override
    public boolean hasNext(int[] array) {
        if (count < array.length) {
            return true;
        } else {
            count = 0;
            return false;
        }
    }
}
