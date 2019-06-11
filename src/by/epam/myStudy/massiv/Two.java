package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args){
        System.out.println("Дана последовательность дейтвительных чисел.\nВведие ее длинну:");

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)( Math.random()*100);
        }
        System.out.println("Наш массив имеет вид: " + Arrays.toString(array));


        System.out.println("Замените все ее члены, больше Z, этим числом.\nВведите Z : ");
        int z = scan.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > z){
             array[i] = z;
             count++;
            }
        }

        System.out.println("New array has veiw: " + Arrays.toString(array) + "\nWe done " + count + " changes.");
    }
}
