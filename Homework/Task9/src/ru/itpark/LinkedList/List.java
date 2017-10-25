package ru.itpark.LinkedList;

public interface List {
    void addToBegin(int element);
    void addToEnd(int element);
    void addByPosition( int position, int element);
    void lengthOfList();
    void deleteByPosition(int position);
    void deleteByElement(int element);


    Iterator iterator();
}
