package ru.itpark;

public class Document {
    String lines[] = new String[5];
    int count = 0;

    void showDocument(){
        for (int i = 0; i < lines.length; i++) {
            // тернарный условный оператор e ? a : b
            String lineToOut = lines[i] == null ? "_______" : lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    void addLineToBegin(String newLine){
        for (int i = count; i > 0; i--) {
            lines[i] = lines[i - 1];
        }
        lines[0] = newLine;
        count++;
    }
    void addLineToEnd(String newLine){
        lines[count] = newLine;
        count++;
    }
    void  deleteLine(int number){
        for (int i = number; i < lines.length - 1; i++) {
            lines[i] = lines[i + 1];
        }
        lines[lines.length - 1] = null;
        count--;
    }
    void removeLine(String newLine, int number){
        lines[number] = newLine;
    }
    void clearLine(int number){
        lines[number] = null;
    }
}
