package ru.itpark.LinkedList;

public interface List {
    void addToBegin(int element);
    void addToEnd(int element);
    void addByPosition( int position, int element);
    int lengthOfList();
    void deleteByPosition(int position);
    void reverseList();


    Iterator iterator();
}
