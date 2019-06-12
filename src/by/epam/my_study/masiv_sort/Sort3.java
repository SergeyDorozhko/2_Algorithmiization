package by.epam.my_study.masiv_sort;

import java.util.Arrays;

public class Sort3 {
    /*
    Сортировка выбором. дана гн убывающая последоваелность чисел. ребуется переставить элементы так чтобы они были расположены по убыванию.
    Для этого в массиве начиная с первого выбирается наибольший элемент и ставится на перво место, а первый на место наибльшего.
    Затем,начиная со второго процедура повторяется. написать алгоритм сортировки выбором.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4, 5, 8, 9};
        int forChange;
        for (int i = 0; i < array.length / 2; i++){
            forChange = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = forChange;
        }


        System.out.println("result: " + Arrays.toString(array));

    }
}