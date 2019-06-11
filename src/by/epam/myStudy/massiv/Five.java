package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Five {
    public static void main(String[] args){
        System.out.println("Даны целые числа, в количестве: ");

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < array.length; i++ ){
            array[i] = (int) ((Math.random()*size)+1);
        }
        System.out.println("Our array has view: " + Arrays.toString(array));
        System.out.print("\n\nThis task result is: [");
        for (int i = 0; i < array.length; i++){
            if (array[i] > i){
                System.out.print(array[i] + ", ");
            }
        }

    }
}
