package ru.itpark;

public class Main {

    public static void main(String[] args) {
        TextViewer viewer = new TextViewer();
        viewer.setText("Hi, my order is 234, where is it???");
        viewer.addTask(new LettersTask(viewer));

        viewer.addTask(new DigitsTask(viewer));

        viewer.addTask(new PmTask(viewer));
        viewer.process();
    }
}
