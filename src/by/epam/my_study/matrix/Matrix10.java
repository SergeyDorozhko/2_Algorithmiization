package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix10 {

    /*
    Найдите положительные элементы главной диагонали матрицы
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the square matrix size, N =: ");

        int matrixSize = scan.nextInt();


        int [][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = (int) (Math.random()*20 - 10);
            }
        }



        System.out.println("Matrix has veiw: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Positiv elements on main diagonal are: ");
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            if (matrix[i][j] > 0) {
                System.out.print(matrix[i][j] + ", ");
            }
        }

    }
}
