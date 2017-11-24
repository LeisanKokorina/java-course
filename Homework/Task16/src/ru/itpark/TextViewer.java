package ru.itpark;

public class TextViewer {

    private Runnable tasks[] = new Runnable[10];
    private int tasksCount;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void addTask(Runnable task) {
        tasks[tasksCount] = task;
        tasksCount++;
    }

    public void process() {
        for (int i = 0; i< tasksCount;i++){
            new Thread(tasks[i]).start();
        }
    }
}
