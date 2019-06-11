package by.epam.my_study.matrix;

import java.util.Arrays;

public class Matrix11 {
    /*
    Матрицу 10*20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк в которых 5
    встречается 3 и более раз.
     */
    public static void main(String[] args){
        int [][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j ++){
                matrix[i][j] = (int) (Math.random()*16);
            }

        }



        System.out.println("Matrix ha view: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }


        System.out.print("Line numbers where we meat number 5 3 or more times: ");
        for (int i = 0; i < matrix.length; i++){
            int countFive = 0;
            for (int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 5){
                    countFive++;
                }

            }
            if(countFive >= 3){
                System.out.println(i + ", ");
            }
        }
    }
}
