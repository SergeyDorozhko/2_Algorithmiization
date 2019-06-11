package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix3 {
    /*
    Дана матрица. Вывести К-ю строку и Р-й столбец
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер матрицы, в формате NxM:");
        String matrixSize = scan.nextLine();
        String[] matrixSizeArray = matrixSize.split("x",2);

        int verticalSize = Integer.parseInt(matrixSizeArray[0]);
        int horizotalSize = Integer.parseInt(matrixSizeArray[1]);

        int [][] matrix = new int[verticalSize][horizotalSize];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random()*15+1);
            }
        }

        System.out.println("Матрица имеет вид: ");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("\nКакой столбец матрицы вывеси?");
        int colomNum = scan.nextInt() - 1;
        System.out.println("Столбец №" + colomNum + ": ");
        for (int i = 0; i < matrix.length; i++){
            System.out.print(matrix[i][colomNum] + ", ");
        }


        System.out.println("\nКакую строку вывести?");
        int lineNum = scan.nextInt() - 1;
        System.out.print("Строка №" + lineNum + ": ");
        for(int i = 0; i < matrix[lineNum].length; i++){
            System.out.print(matrix[lineNum][i] + ", ");
        }

    }
}
