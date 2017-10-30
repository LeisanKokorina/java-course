package ru.itpark;

public class HumanSelectionSorter implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human[] humans){
        for (int i = 0; i < humans.length; i++) {
            Human min = humans[i];
            int minIndex = i;
            for (int j = i; j < humans.length; j++) {
                if (comparator.compare(humans[i], min)<0) {
                    min = humans[j];
                    minIndex = j;
                }
            }
            Human temp = humans[i];
            humans[i] = humans[minIndex];
            humans[minIndex] = temp;
        }
    }
}
