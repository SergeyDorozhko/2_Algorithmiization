package by.epam.my_study.masiv_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort6 {
    /*
    Сортировка Шелла.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the array size: ");

        int arraySize = scan.nextInt();
        int [] array = new int[arraySize];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*22);
        }

        System.out.println("Our array is: " + Arrays.toString(array));

        for(int i = 0; i < array.length - 1; i++){
            int change;
            if(array[i] > array[i + 1]){
                change = array[i];
                array[i] = array[i + 1];
                array[i + 1] = change;
                if( i > 0){
                    i -= 2;
                }
            }
//            System.out.println(Arrays.toString(array));
        }

        System.out.println("Result: " +Arrays.toString(array));
    }
}
