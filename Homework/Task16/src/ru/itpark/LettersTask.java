package ru.itpark;

public class LettersTask implements Runnable {
    private String text;
    public LettersTask(TextViewer textViewer){
        this.text = textViewer.getText();
    }
    @Override
    public void run() {
        System.out.println("Буквы ");
        for(int i =0; i< text.length();i++){
            int currentByte = text.charAt(i);
            if ((currentByte >= 'A' && currentByte <= 'Z' || currentByte >= 'a' && currentByte <= 'z'
                    ||currentByte >= 'А' && currentByte <= 'Я' || currentByte >= 'а' && currentByte <= 'я'  ) ){
                System.out.println( (char)currentByte);
            }
        }
    }
}
