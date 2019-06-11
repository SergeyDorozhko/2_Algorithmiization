package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix9 {
    /*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    Определить, какой столбец содержит максимальну сумму
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the matrix size, in format NxM: ");

        String matrixSize = scan.nextLine();
        String [] matrixSizeArray = matrixSize.split("x", 2);
        int verticalSize = Integer.parseInt( matrixSizeArray[0]);
        int horizontalSize = Integer.parseInt(matrixSizeArray[1]);

        int [][] matrix = new int[verticalSize][horizontalSize];
        for  (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*20);
            }
        }

        System.out.println("Matrix has veiw: ");

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        /*
        Find summ of all coloms and write it to new array
         */

        int matrixMaxHorizontalLength = 0;     //if matrix has different horizontal lenght find the lonngest for our array ofsumm
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){

                if (j >= matrixMaxHorizontalLength){
                    matrixMaxHorizontalLength = j+1;
                }
            }
        }

        int [] arrayOfColomSumm = new int[matrixMaxHorizontalLength];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                arrayOfColomSumm[j] += matrix[i][j];
            }
        }
        System.out.println("Look at the summ of each colom: " + Arrays.toString(arrayOfColomSumm));


        int maxSummValue = arrayOfColomSumm[0];
        int maxColomNum = 0;
        for(int i = 0; i < arrayOfColomSumm.length; i++){
            if (arrayOfColomSumm[i] > maxSummValue){
                maxSummValue = arrayOfColomSumm[i];
                maxColomNum = i+1;        // + 1 is for better visability
            }
        }

        System.out.println("The colom with maximum summ of elements is the colom №" + maxColomNum + " and the summ of it is : " + maxSummValue);
    }
}
