package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Создадим массив. Задайте его размер:");
        int arraySize = input.nextInt();
        int [] array = new int[arraySize];


        for (int i = 0; i< array.length; i++ ){
            int randomNumber = (int) (Math.random()*20);
            array[i] = randomNumber;
        }

        System.out.println("Наш массив: " + Arrays.toString(array));

        System.out.println("Введите число K для нахождения в массиве кратних ему значений: ");

        int devider = input.nextInt();

        int summ = 0;

        System.out.println("Числа которые кратны " + devider + ":");
        for(int i = 0; i < array.length; i++){
        if(array[i] % devider ==0){
        summ += array[i];
            System.out.print(array[i] + "; ");
        }

        }
        System.out.println("\nСумма чисел кратных " + devider + " равна " + summ);
    }
}
