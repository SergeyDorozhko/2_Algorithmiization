package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix12and13 {
    /*
    12 отсорировать строки матрицы по возрастанию и убыванию значениий элементов
    13 отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the matrix size in format NxM: ");
        String [] matrixSize = scan.nextLine().split("x",2);
        int verticalSize = Integer.parseInt(matrixSize[0]);
        int horizontalSize = Integer.parseInt( matrixSize[1]);

        int [][] matrix = new int[verticalSize][horizontalSize];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*10);
            }
        }

        System.out.println("Matrix Has view:");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


        /*
        сортировка строк по взврастанию
         */
        for (int i = 0; i < matrix.length; i++){
            int forSort;
            boolean checkSort = false;
            while(checkSort == false) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] < matrix[i][j - 1]) {
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i][j - 1];
                        matrix[i][j - 1] = forSort;
                    }
                }
            /*
             check
            */


                for( int j = 1; j < matrix[i].length; j++){
                    if(matrix[i][j] >= matrix[i][j - 1]){
                        checkSort = true;
                    }else{
                        checkSort = false;
                        break;
                    }
                }
            }

        }

        System.out.println("After sort  matrix (lines a-z) looks like: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


        /*
        сортировка строк по убыванию
         */
        for(int i = 0; i < matrix.length; i++){
            int forSort;
            boolean checkSort = false;
            while (checkSort == false) {
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i][j - 1]) {
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i][j - 1];
                        matrix[i][j - 1] = forSort;
                    }
                }

            /*
            cheak sort
             */
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] <= matrix[i][j - 1]) {
                        checkSort = true;
                    } else {
                        checkSort = false;
                        break;
                    }
                }
            }

        }
        System.out.println("After sort (lines z-a) matrix has view:");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }



        /*
        sort colomn a-z
         */
        boolean cheakSort = false;
        while(cheakSort == false){
            int forSort;
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(matrix[i][j] < matrix[i-1][j]){
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i-1][j];
                        matrix[i-1][j] = forSort;
                    }
                }
            }

            /*
            cheak our sort
             */



            for(int i = 1; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j ++){
                    if(matrix[i][j] >= matrix[i - 1][j]){
                        cheakSort = true;
                    }else{
                        cheakSort = false;
                        break;
                    }
                }

                if(cheakSort == false){
                    break;
                }

            }
        }

        System.out.println("After colomn sort (a - z), matrix has view: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


        /*
        sort colomn (z - a)
         */
        do {
            int forSort;
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i - 1][j]) {
                        forSort = matrix[i][j];
                        matrix[i][j] = matrix[i -1][j];
                        matrix[i - 1][j] = forSort;
                    }
                }
            }

            /*
            cheak sort
             */

            for (int i = 1; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    if(matrix[i][j] <= matrix[i - 1] [j]){
                        cheakSort = true;
                    }else{
                        cheakSort = false;
                        break;
                    }

                }
                if (cheakSort == false){
                    break;
                }
            }

        }while(cheakSort == false);


        System.out.println("After sort coloms (z-a), matrix has view: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }





    }
}
