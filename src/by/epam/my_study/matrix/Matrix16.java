package by.epam.my_study.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the size of Magic Square (odd)");
        int matrixSize = scan.nextInt();

        /*
        Принцип работы программы:
        1
            Вычислите магическую константу.[1] Это можно сделать при помощи простой математической формулы [n * (n2 + 1)] / 2, где n – количество строк или столбцов в квадрате. Например, в квадрате 3x3 n=3, а его магическая константа:
            Магическая константа = [3 * (32 + 1)] / 2
            Магическая константа = [3 * (9 + 1)] / 2
            Магическая константа = (3 * 10) / 2
            Магическая константа = 30/2
            Магическая константа квадрата 3х3 равна 15.
            Сумма чисел в любой строке, столбце и по диагонали должна быть равна магической константе.

        2
            Напишите 1 в центральной ячейке верхней строки. Строить любой нечетный квадрат нужно именно с этой ячейки.
            Например, в квадрате 3х3 напишите 1 во второй ячейке верхней строки, а в квадрате 15х15 напишите 1 в восьмой ячейке верхней строки.

        3
            Следующие числа (2,3,4 и так далее по возрастанию) записывайте в ячейки по правилу: одна строка - вверх, один столбец - вправо. Но, например, чтобы записать 2, нужно "выйти" за пределы квадрата, поэтому существуют три исключения из данного правила:
            Если вы вылезли за верхний предел квадрата, напишите цифру в самой нижней ячейке соответствующего столбца.
            Если вы вылезли за правый предел квадрата, напишите цифру в самой дальней (левой) ячейке соответствующей строки.
            Если вы попали на ячейку, которая занята другой цифрой, напишите цифру непосредственно под предыдущей записанной цифрой.
    */

        int majicConst = (int)(matrixSize * (Math.pow(matrixSize,2) + 1)) / 2;
        System.out.println("Магическая константа равна= " + majicConst);
        int maxValueOfElement = (int) Math.pow(matrixSize,2);

        int [][] magicMatrix = new int[matrixSize][matrixSize];
        for (int i = 1, j = 0, k = magicMatrix.length / 2; i <= maxValueOfElement; i++, j--, k++) {
            if (j >= 0 && k < magicMatrix.length) {
                if (magicMatrix[j][k] == 0) {
                    magicMatrix[j][k] = i;
                }else {
                    j += 2;
                    k--;
                    magicMatrix[j][k] = i;
                }
            } else if (j < 0 && k < magicMatrix.length) {
                j = magicMatrix.length - 1;
                if (magicMatrix[j][k] == 0) {

                    magicMatrix[j][k] = i;
                }
            }else if(j < 0 && k >= magicMatrix.length){
                j += 2;
                k--;
                magicMatrix[j][k] = i;

            }else if( k >= magicMatrix.length && j >=0){
                k = 0;
                if(magicMatrix[j][k] == 0) {
                    magicMatrix[j][k] = i;
                }else {
                    j += 2;
                    k--;
                    magicMatrix[j][k] = i;
                }
            }else{
                System.out.println("нет места для элемента j = " + j + " k = " + k);
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < magicMatrix.length; i++){
            System.out.println(Arrays.toString(magicMatrix[i]));
        }

    }
}
