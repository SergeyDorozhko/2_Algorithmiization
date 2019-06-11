package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix6 {
    /*
            сформировать квадратную матрицу порядка N по заданному абразцу (N - Четрое)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("задайте размер матрицы (четрое, положительное число):");

        int size = 0;

        boolean taskOkIndicator = false;

        do {
            size = scan.nextInt();
            if(size > 0 && size % 2 == 0){
                taskOkIndicator = true;
            }else {
                System.out.println("Введенное вами значение не удовлетворяет условию, попробуйе еще раз:");
            }
            }
        while (taskOkIndicator == false);

        int [][] matrix = new int[size][size];
        for(int i = 0; i < matrix.length; i++){
            if(i <= (matrix.length - 1) / 2){
                for(int j = i; j < matrix[i].length - i; j++){

                    matrix[i][j] = 1;
                }
            }else{
                for(int j = matrix[i].length - i-1; j < i+1; j++){
                    matrix[i][j]=1;
                }
            }
        }




        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
