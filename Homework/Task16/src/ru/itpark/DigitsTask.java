package ru.itpark;

public class DigitsTask implements Runnable {
    private String text;
    public DigitsTask(TextViewer textViewer){
        this.text = textViewer.getText();
    }
    @Override
    public void run() {
        System.out.println("Цифры ");
        for(int i =0; i< text.length();i++){
            int currentByte = text.charAt(i);
            if (currentByte >= '0' && currentByte <= '9' ){
                System.out.println((char)currentByte);
            }
        }
    }
}
