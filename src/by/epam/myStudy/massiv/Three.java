package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public  static void main(String[] args){
        System.out.println("Array length is :");

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++ ){
            array[i] = (int) ((Math.random()-0.5) * 100);
        }
        System.out.println("Your array has view: " + Arrays.toString(array));
        int countPlus = 0;
        int countMines = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                countPlus++;
            }else if(array[i] < 0){
                countMines++;
            }else{
                countZero++;
            }
        }
        System.out.println("Положительных: " + countPlus + "\nОтрицательных: " + countMines + "\nНулевых: " + countZero);
    }
}
