package ru.itpark;

public class WeigthHumanComparator implements HumanComparator {
    public int compare( Human a, Human b){
        return a.getWeight() - b.getWeight();
    }
}
