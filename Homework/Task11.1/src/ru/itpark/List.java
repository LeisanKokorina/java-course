package ru.itpark;

public interface List {

    void addToEnd(Object element);
    void addByIndex(Object element, int index);
    Iterator iterator();
}
