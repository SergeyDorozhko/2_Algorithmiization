package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix4 {
    /*
    сформировать квадратную матрицу порядка N по заданному абразцу (N - Четрое)
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("задайте размер матрицы (четрое, положительное число): ");

        boolean taskOkIndicator = false;
        int size = 0;
        do{
            size = scan.nextInt();
            if (size > 0 && size % 2 == 0){
                taskOkIndicator = true;
            }else {
                System.out.println("Введенное вами значение не удовлетворяет условию, попробуйе еще раз:");
            }
        }while(taskOkIndicator == false);




        int [][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++){
            if( i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = j+1;
                }
            }else{
                for (int j = 0; j < matrix[i].length; j++ ){
                    matrix[i][j] = matrix[j].length - j;
                }
            }
        }

        System.out.println("мы получили матрицу: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
