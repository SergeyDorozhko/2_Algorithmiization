package by.epam.my_study.masiv_sort;

import java.util.Arrays;

public class Sort5 {
    /*
    Сортировка вставками. Дана последовательность чисел. Требуется пересавить числа в порядке возростания.
    Делается это следующим образом. Пусть а1, а2 , аN - упорядоченая последовательность, т.е a1 <= a2<= aN. берется следующее число aI+1 и вставяется в
    последовательность так, чтобы новая последователнось тоже возростающей. Процесс производится до тех пор пока все
    элементы от aI+1 до N не дубут перебраны.
    */

    public static void main(String[] args){
        int [] array = {1, 5, 8, 2, 18, 3, 15, 0, 10, 12};
        int elementNum = 0;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    elementNum = i;
                } else {
                    elementNum = i;
                    break;
                }
            }
            doubleSearch(elementNum, array);  //передаем в метод наш массив и номер элемента до которого массив отсортирован по возростанию
            System.out.println(Arrays.toString(array));
        }while(elementNum != array.length - 2);

        System.out.println("Result: " + Arrays.toString(array));
    }

    public static int[] doubleSearch(int elementNumber, int [] array){
        int leftBound = 0;
        int rightBound = elementNumber;
        int midle;
        int insertTo = -1;
        do{
            midle = (leftBound + rightBound) / 2;
            if(array[elementNumber + 1] < array[midle]){
                rightBound = midle;
            }else if(array[elementNumber + 1] > array[midle]){
                leftBound = midle;
            }else{
                insertTo = midle + 1;
                break;
            }
        }while (rightBound - leftBound > 1);

        if(array[elementNumber + 1] < array[leftBound]){    //условие для установки минимального значения в начало массива.
            insertTo = leftBound;
        }else if(insertTo == -1){
            insertTo = leftBound + 1;
        }

        int changeElements;
        for (int i = elementNumber +1; i > insertTo; i-- ){
            changeElements = array[i];
            array[i] = array[i - 1];
            array[i - 1] = changeElements;
        }
        return array;
    }
}
