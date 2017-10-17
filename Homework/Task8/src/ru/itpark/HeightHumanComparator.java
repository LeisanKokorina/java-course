package ru.itpark;

public class HeightHumanComparator  implements HumanComparator {
    public int compare (Human a, Human b){
        return a.getHeight() - b.getHeight();
    }


}
