package ru.itpark;

public interface List {
    void add(Object object);
    void addByIndex(int index, Object element);

    Iterator iterator();
}
