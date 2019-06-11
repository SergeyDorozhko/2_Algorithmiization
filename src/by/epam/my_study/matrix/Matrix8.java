package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix8 {
    /*
    В числовой матрице пменять два столбца.
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер матрицы, в формате NxM: ");

        String matrixSize = scan.nextLine();
        String[] matrixSizeArray = matrixSize.split("x",2);
        int veticalSize = Integer.parseInt(matrixSizeArray[0]);
        int horizontalSize = Integer.parseInt(matrixSizeArray[1]);


        int [][] matrix = new int[veticalSize][horizontalSize];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*10);
            }
        }


        System.out.println("Мы получили массив:");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }



        /*
        выполняем замену столбцов
         */
        System.out.println("Какой столбец вы хотите поменть?");
        int colomNumChanceOne = scan.nextInt();
        System.out.println("На какой солбец будем менять?");
        int colomNumChangeTwo = scan.nextInt();
        int forChange = 0;
        for (int i = 0; i < matrix.length; i++){
            forChange = matrix[i][colomNumChanceOne];
            matrix[i][colomNumChanceOne] = matrix[i][colomNumChangeTwo];
            matrix[i][colomNumChangeTwo] = forChange;
        }



        System.out.println("Массив после замены: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
