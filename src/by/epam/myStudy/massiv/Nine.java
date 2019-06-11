package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Nine {
    /*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающннся число.
    Если таких несклько, то определить меньшее из них.
         */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("задайте длинну последовательности:");
        int size = scan.nextInt();
        int [] array = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*5);
        }
        System.out.println("последовательность: " + Arrays.toString(array));

        /*
        подсчитаем сколко раз каждый элемент повторялся
         */
        int [] arrayOfRepeat = new int[size];

        for (int i = 0; i < array.length; i++ ){
            int repeatCount = 0;
            for(int j = 0; j < array.length; j++){
                if (array[i] == array[j]){
                    repeatCount++;
                }
                arrayOfRepeat[i] = repeatCount;
            }
        }
        System.out.println("В массиве видим какой элемент сколько раз повторялся:" + Arrays.toString(arrayOfRepeat));

        /*
        найдем индекс  наиболее часто повторяющихся
         */

        int mostRepeated = 0;//подсчитаем сколько больше всего повторкний
        for (int i = 0; i <  arrayOfRepeat.length; i++ ){
            if(arrayOfRepeat[i] > mostRepeated){
                mostRepeated = arrayOfRepeat[i];
            }
        }
        System.out.println("Наибольшее число повторений: " + mostRepeated);

        int count = 0; //  количесво чисел c максимальным повторением
        for (int i = 0; i < arrayOfRepeat.length; i++){
            if(arrayOfRepeat[i] == mostRepeated){
                count++;
            }
        }

        /*
        создадим массив из чисел которые повторялись чаще всего
         */

        int [] arrayOfMostRepElements = new int[count];
        int j = 0; //итеатор для нового массива
        for (int i = 0; i < arrayOfRepeat.length; i++) {
            if (arrayOfRepeat[i] == mostRepeated) {
                arrayOfMostRepElements[j] = array[i];
                j++;
            }
        }
        System.out.println("Массив наиболее часто повторяющихся чисел (из первоначального массива) : " + Arrays.toString(arrayOfMostRepElements));



        /*
        найдем ответ на данную задачу, а именно минмаьное сриди наиболее часто повторяющихся
         */
        int minValueOfMostRepeated = arrayOfMostRepElements[0];
        for(int i=0; i < arrayOfMostRepElements.length; i++){
            if(arrayOfMostRepElements[i] < minValueOfMostRepeated){
                minValueOfMostRepeated = arrayOfMostRepElements[i];
            }
        }

        System.out.println("Минимальное сриди наиболее повторяющихся чисел: " + minValueOfMostRepeated);

    }
}
