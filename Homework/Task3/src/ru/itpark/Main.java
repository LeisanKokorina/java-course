package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        System.out.println("Заполните массив: ");
        int array[] = new int [n];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
            //сумма четных и нечетных элементов
            if(array[i]%2==0){
                sum1 = sum1+array[i];

            }else{
                sum2 = sum2+array[i];

            }
            //сумма элементов, стоящих на четной и нечетной позиции
            if(i%2==0){
                sum3 = sum3+array[i];
            }
            else{
                sum4=sum4+array[i];
            }

        }
        //количество локальных максимумов
        int countmax = 0;
        for(int i=0;i<array.length-2;i++) {
            if (array[i] < array[i+1] & array[i+1] > array[i + 2]) {
                countmax++;

            }
        }
        //максимально длинная поледовательность возрастающих чисел - вывод длины
        int length=1;
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                length++;

            }
            if(array[i]>=array[i+1]){
                length=1;
            }
        }


        System.out.println("сумма четных элементов: "+ sum1);
        System.out.println("сумма нечетных элементов: "+ sum2);
        System.out.println("сумма элементов, стоящих на четной позиции: "+ sum3);
        System.out.println("сумма элементов, стоящих на нечетной позиции: "+ sum4);
        System.out.println("количество локальных максимумов "+ countmax);
        System.out.println("максимально длинная поледовательность возрастающих чисел:"+length);
        System.out.println("последовательность с заменой 0 на отрицательное число следующего элемента: ");
        //замена всех нулей в последовательности отрицательным числом следующего элемента
        for(int i=0; i<array.length;i++){
            if(array[i]==0){
                array[i]=-array[i+1];
            }
            System.out.print(array[i]);
        }


    }
}
