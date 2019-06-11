package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Four {
    public static void main(String[] args){
        System.out.println("Даны действителье числа.\nВведие кол-во:");

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)( Math.random()*100);
        }
        System.out.println("Наш массив имеет вид: " + Arrays.toString(array));

        int maxValue = array[0];
        int minValue = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }else if (array[i] < minValue){
                minValue = array[i];
            }else{
                continue;
            }
        }
        System.out.println("min Value = " + minValue + "\nMax Value = " + maxValue);

        for(int i = 0; i < array.length; i++){
            if(array[i] == maxValue){
                array[i] = minValue;
            }else if(array[i] == minValue){
                array[i] = maxValue;
            }else{
                continue;
            }
        }

        System.out.println("Array after change minValue and max Value: " + Arrays.toString(array));
    }
}
