package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int a [] =  new int [n];
        for (int i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        reverse(a);
        System.out.println();
        /*for (int i = 0;i<a.length;i++){
            System.out.println(a.toString());
        }*/
        public static  void reverse(int array[]){
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }


    }
}
