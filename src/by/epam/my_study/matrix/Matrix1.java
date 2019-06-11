package by.epam.my_study.matrix;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {
    /*
    Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше послднего.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер матрицы (в формате NxM):");
        String matrixSize = scan.nextLine();

        System.out.println("n*m= " + matrixSize);
        String[] matrixSizeSplit = matrixSize.split("x",2);

        int verticalSize = Integer.parseInt(matrixSizeSplit[0]);
        int horizontalSize = Integer.parseInt(matrixSizeSplit[1]);

        int[][] matrix  =new int[verticalSize][horizontalSize];
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*15);
            }
        }

        /*
        выведем нашу матрицу
         */
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


        System.out.println("Выводим нечетные столбцы где первый элемент больше последнего:");
        for (int i = 1; i < matrix[0].length; i +=2){
            if(matrix[0][i] > matrix[matrix.length-1][i]) {
                System.out.println("Столбец №" + i + ": ");
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i] + ", ");
                }
                System.out.println();
            }
        }
    }
}
