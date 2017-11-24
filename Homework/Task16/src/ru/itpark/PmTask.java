package ru.itpark;

public class PmTask extends Thread implements Runnable {
    private String text;
    public PmTask(TextViewer textViewer){
        this.text = textViewer.getText();
    }
    @Override
    public void run() {
        //System.out.println("Знаки ");
        for(int i =0; i< text.length();i++){
            int currentByte = text.charAt(i);
            if (currentByte >= 39 && currentByte <= 46 || currentByte >= 58 && currentByte <= 63
                    || currentByte == 33 ||currentByte == 34 || currentByte == 96 ){
                System.out.println("Знаки " + (char)currentByte);
            }
        }
    }
}
