package by.epam.my_study.decomposition;

import java.util.Arrays;

public class Decomposition10 {
     /*
    Дано натуральное число N. Написать метод для формирования массива, элементами которого являются цифрами числа N.
     */

    public static void main(String[] args){
        int number = 48456432;
        System.out.println(Arrays.toString(arrayMaker(number)));
    }

    public static int [] arrayMaker(int number){
        int numberLehgthCounter = 0;
        int numberForCount = number;
        do{
            numberForCount /= 10;
            numberLehgthCounter++;
        }while(numberForCount > 0);
        System.out.println(numberLehgthCounter);

        int [] array = new int[numberLehgthCounter];
        for(int i = array.length - 1; i >= 0; i--){
            array[i] = number % 10;
            number /= 10;
        }

        return array;
    }
}
