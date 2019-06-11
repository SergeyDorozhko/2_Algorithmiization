package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix7 {
    /*
    Сформировать квадатную матрицутипа N по правилу A[I,J] = sin((I^2 - J^2) / N)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы:");

        int size = scan.nextInt();
        double [][] matrix = new double[size][size];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = Math.sin((Math.pow(i,2) - Math.pow(j,2) / matrix.length));
            }
        }


        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        int countPositivElem = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > 0){
                    countPositivElem++;
                }
            }
        }

        System.out.println("Количество полжительных элементов в матрице: " + countPositivElem);
    }
}
