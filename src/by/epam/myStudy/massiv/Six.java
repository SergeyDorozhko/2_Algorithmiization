package by.epam.myStudy.massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Six {

    /*Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, орядковые номера которых являются простыми числами*/

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Задайте длинну массива: " );

        int size = scan.nextInt();

        int [] array = new int[size];

        for(int i =0; i < array.length; i++){
            array[i] = (int) (Math.random()*10+1);
        }

        System.out.println("Наш массив: " + Arrays.toString(array));

        int summ = 0;

        for (int i = 0; i < array.length; i++){
            int simpleCheak = 0;            //
            for(int j = 1; j < i; j++){   //данный цик проверет i  простое число или нет
                if(i % j == 0){
                simpleCheak += j;
                }

            }
            if (simpleCheak < 2){
                System.out.println("порядковый номер " + i + ", его значение " + array[i]); //убеждаемся что проверка на простые числа работает
                summ += array[i];
            }

        }
        System.out.println("Сумма элементов равна: \n" + summ);


        System.out.println("Простые числа (порядковые номера): " );
    }

}
