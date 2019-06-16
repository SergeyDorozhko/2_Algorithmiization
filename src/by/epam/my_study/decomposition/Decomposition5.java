package by.epam.my_study.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Decomposition5 {
    /*
    Составить программу, которая в массиве A[n] находи ворое по виличине число.
     */

    public static void main(String[] args){
        System.out.println("Input array size: ");
        Scanner scan = new Scanner(System.in);
        int [] array = arrayMaker(scan.nextInt());
        System.out.println(Arrays.toString(array));

        System.out.println("Pre maximal value is: " + preMaxValue(array));

    }

    public static int[] arrayMaker(int arraySize){
        int [] array = new int[arraySize];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*20);
        }
        return array;
    }

    public static int preMaxValue(int [] array){
        int maxValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }

        int preMaxValue = array[0] - maxValue;
        for(int i = 0; i < array.length; i++){
            if(array[i] > preMaxValue && array[i] < maxValue){
                preMaxValue = array[i];
            }
        }
        return preMaxValue;
    }
}
