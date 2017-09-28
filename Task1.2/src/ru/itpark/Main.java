package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //упрощенная задача, ввод чисел от 1 до 10
        //чтобы пропустить число, вводим 0
        Scanner sc =  new Scanner(System.in);
        int n = 10;
        int array[]=new int[n];

        for(int i = 0; i<array.length;i++){
            array[i]=sc.nextInt();

        }
        int sum=0;

        for(int i=0;i<array.length;i++){

            sum= sum + array[i];
        }
        int S =( n*(n +1))/2;
        S=S-sum;
        System.out.println("Пропущенное число : "+ S);

        //считаем сумму, которая должна была получиться по формуле (n(n+1))/2
        //вычитаем из нее ту сумму, которая получилась из введенных нами чисел
        //разница в суммах - пропущенное число
    }
}
