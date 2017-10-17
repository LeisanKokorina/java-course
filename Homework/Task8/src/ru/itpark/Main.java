package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    Human clara = new Human("Clara",160, 25, 55);
	    Human doctor = new Human("Doctor",185, 30, 70);
	    Human bill = new Human("Bill",165, 26, 60);
	    Human humans[] = {clara, doctor, bill};
	    HumanComparator comparator = new AgeHumanComparator();
		HumanSorter sorter = new HumanSelectionSorter();
		sorter.sort(comparator,humans);
		for (Human human : humans){
			System.out.println(human);
		}
    }
}
