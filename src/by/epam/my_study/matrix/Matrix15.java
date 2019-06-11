package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix15 {
    /*
    Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input matrix size in format NxM:");
        String[] matrixSize = scan.nextLine().split("x", 2);
        int verticalSize = Integer.parseInt(matrixSize[0]);
        int horizontalSize = Integer.parseInt(matrixSize[1]);

        int [][] matrix = new int[verticalSize][horizontalSize];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random()*30);
            }
        }


        System.out.println("matrix has view:");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        /*
        find max value of all elements
         */
        int maxValue = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > maxValue){
                    maxValue = matrix[i][j];
                }
            }
        }

        System.out.println("Max value of element of matrix is: " + maxValue);


        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 != 0){
                    matrix[i][j] = maxValue;
                }
            }
        }


        System.out.println("Result: ");

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


    }
}
