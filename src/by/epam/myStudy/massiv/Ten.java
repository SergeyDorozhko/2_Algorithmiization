package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Ten {
    /*
    Дан целочисленный массив с количеством элемонтов n.Сжать массив, выбросив из него каждый второй элемент
    (освободившиеся элементы заполнить нулями. Дополнительный массив не использовать.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте длинну массива:");

        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*10+1);
        }
        System.out.println("Массив: "+ Arrays.toString(array));

        for (int i = 1; i < array.length; i+=2){
           array[i] = 0;
        }
        System.out.println("Каждый второй элемент заменить на \"0\": " + Arrays.toString(array));
        /*
        в касчестве сжатия перенесем все нечетные элементы в начало массива
         */
        int fieldForSort;
        for(int i = 2, j = 1; i < array.length; i+=2, j++ ){
            fieldForSort = array[j];
            array[j] = array[i];
            array[i] = fieldForSort;
        }
        System.out.println("Result: " + Arrays.toString(array));

    }

}
