package ru.itpark;

public interface Iterator {
    int next(); //вернуть текущий элемент, сдвинув указатель, в следующий раз при вызове этого метода должен вернуться след элемент
    boolean hasNext();
}
