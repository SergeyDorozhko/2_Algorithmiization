package by.epam.my_study.masiv_sort;

import java.util.Arrays;

public class Sort4 {
    /*
    Сортировка обменами. дана последовательность чисел а1 <=a2 <= a3 <=aN. Требуется перестивить числа в порядке возрастания.
    для этого сравниваюс 2 соседних числа а1 и а2. Ести а1 > а2 то делается перестановка. Так продолжается до тех пор пока все
    элементы не станут расположены в пордке созростания. Составить алгоритм сортировки, подсчитывая при этом кол-во перестановок
     */
    public static void main(String[] args){
        int [] array = {1, 2, 4, 6 , 7, 7, 8, 8, 8, 10, 13, 18};

        boolean sortIndicator = false;
        int counterOfChanges = 0;
        do{
            int forSort;
            for(int i = 0; i < array.length-1; i++){   //делаем сортировку по условию (в задании опечатка, делаем последовательность не возростающей  )
                if(array[i] < array[i+1]){
                    forSort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = forSort;
                    counterOfChanges++;
                }
            }


            /*
            проводим проверку всели элементы отсортированы
             */

            for (int i = 0; i < array.length - 1; i++){
                if(array[i] >= array[i+1]){
                    sortIndicator = true;
                }else{
                    sortIndicator = false;
                    break;
                }

            }

        }while(sortIndicator == false);

        System.out.println("Result " + Arrays.toString(array) + " number of changes: " + counterOfChanges);
    }
}
