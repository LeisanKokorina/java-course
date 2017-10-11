package ru.itpark;

public class Main {

    public static int parse(char digits[]) {
        int result = 0;
        for(int i = 0;i < digits.length;i++){
            int position = digits.length-1-i;// 0-й элемент, значит 3 позиция  и т.д.
            int a =1;
            for(int j = 0;j < position;j++){  //возведение в степень
                a *=10;
            }
            result = result + (digits[i] - 48)* a; //48 = '0'
        }
        return result;
    }

    public static void main(String args[]) {
        char number[] = {'3', '2', '4', '1'};
        int numberAsInt = parse(number);
        System.out.println(numberAsInt); // 3241 должно быть на экране
    }
}
