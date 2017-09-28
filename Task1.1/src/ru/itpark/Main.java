package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Банкомат должен напечатать минимальное количество купюр каждого номинала

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую сумму вы хотите снять?");
        int n = 9;
        int nom []={5000,1000,500,100,50,10,5,2,1};
        int summa = sc.nextInt();
        int kup[] = new int [n];
        for (int i=0;i<n;i++){
            kup[i]=summa/nom[i];
            System.out.println(nom[i]+" "+kup[i]);
            summa=summa%nom[i];
        }





    }
}
