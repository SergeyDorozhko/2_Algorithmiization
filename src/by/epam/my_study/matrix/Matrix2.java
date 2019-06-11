package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix2 {
    /*
    Дана матрица. Вывести элементы стоящие по диагонали
     */
    public static void main(String[] ars){
        System.out.println("Задайте размер массива массивов в формате N*N: ");
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.next());

        int [][] multiArray = new int[size][size];
        for(int i = 0; i < multiArray.length; i++){
            for (int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = (int) (Math.random()*15);
            }
        }

        System.out.println("Массив массивов имеет вид:");
        for (int i = 0; i < multiArray.length; i++){
            System.out.println(Arrays.toString(multiArray[i]));
        }


        /*
        Выведем элементы на главной диагонали
         */
        System.out.println("Элементы главной диагонали: ");
        for(int i = 0; i < multiArray.length; i++) {
            System.out.print(multiArray[i][i] + ", ");
        }

        /*
        Элементы второй диагонали
         */
        System.out.println("\nЭлементы второй диагонали: ");
        for(int i = (multiArray.length-1), j = 0; i >= 0; i--, j++){
            System.out.print(multiArray[i][j] + ", ");
        }
    }

}
