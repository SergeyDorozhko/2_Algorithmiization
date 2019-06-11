package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix14 {
    /*
    Сформировать случайную матрицу m*n, состоящуу из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the matrix size? in format MxN:");

        String[] matrixSize = scan.nextLine().split("x",2);
        int verticalSize = Integer.parseInt(matrixSize[0]);
        int horisontalSize = Integer.parseInt(matrixSize[1]);

        int [][] matrix = new int[verticalSize][horisontalSize];
        for(int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix[i].length; j++){
                matrix[i][j] = 1;
            }
        }
        System.out.println("result:");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


}
