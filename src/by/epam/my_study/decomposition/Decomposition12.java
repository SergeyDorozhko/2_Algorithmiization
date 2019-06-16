package by.epam.my_study.decomposition;

import java.util.Arrays;

public class Decomposition12 {
    /*
    Даны натуральные числа. написать метод формирования массива А, элементами которого являются числа, сумма цифр которых
    равна К и которые не больше N.
     */
    public static void main(String[] args){
        int numbersSumm = 16;
        int maxValue = 1500;
        int arraySize = 9;

        Decomposition12 start = new Decomposition12();
        System.out.println(Arrays.toString(start.arrayMaker(arraySize, numbersSumm, maxValue)));

    }


    public int[] arrayMaker(int arraySize, int sumNumbers, int maxValue){
        int [] array = new int[arraySize];

        for (int i = 0; i < array.length; i++){
            int cheakSum = 0;
            array[i] = (int) (Math.random()*maxValue);
            int cheakNum = array[i];
            do{
                cheakSum += cheakNum % 10;
                cheakNum /= 10;

            }while(cheakNum > 0);

            if(cheakSum != sumNumbers){
                i--;
            }
        }
        return array;
    }
}
