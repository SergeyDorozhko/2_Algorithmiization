package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Seven {

    /*
    Даны действительные числа а1, ... , а2n, Найти max(a1 + a2n, ... an + an+1)
     */

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введте длинну массва, мы ее увеличим в двое=)\nДлинна равна:");
        int halfSize = scan.nextInt();

        int [] array = new int[2*halfSize];

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*20+1);

        }
        System.out.println("Наш массив имеет вид:" + Arrays.toString(array));


        int [] halfArray = new int [halfSize]; // создадим массив в котором просуммируем первое и последнее значения первого массива.

        for (int i = 0; i < halfArray.length; i++){
            halfArray[i] = array[i] + array[array.length-1-i]; // заполняем наш новый массив значениями просуппировав  значения предыдущего массива согласно условию задачи
        }
        System.out.println("Новый массив:" + Arrays.toString(halfArray));


        int maxValue = 0;

        for (int i = 0; i < halfArray.length; i++){
            if(halfArray[i] > maxValue){
                maxValue = halfArray[i];
            }
        }

        System.out.println("Ответ данной задачи: " + maxValue);
    }
}
