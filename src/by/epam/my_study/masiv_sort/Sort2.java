package by.epam.my_study.masiv_sort;

import java.util.Arrays;

public class Sort2 {
    /*
    даны две возврастающие последовательности чисел. Образовать из нихновую
    последовательность чисел так , чтобы она тоже была неубывающей.
     */
    public static void main(String[] args){
        int [] firstArray = {1, 2, 6, 8, 8, 8, 9, 11, 12, 13, 14, 16};
        int [] secondArray = {2, 3, 6, 7, 8, 10, 11, 17, 18, 19, 20};
        int [] resultArray =new int [(firstArray.length + secondArray.length)];


        int i = 0;
        int j = 0;
        int k = 0;
        do{
            if(i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] <= secondArray[j]) {
                    resultArray[k] = firstArray[i];
                    k++;
                    i++;
                } else {
                    resultArray[k] = secondArray[j];
                    k++;
                    j++;
                }
            }else if(i < firstArray.length && j >=secondArray.length ){
                resultArray[k] = firstArray[i];
                k++;
                i++;
            }else{
                resultArray[k] = secondArray[j];
                k++;
                j++;
            }

        }while(k < resultArray.length );


        System.out.println("result: " + Arrays.toString(resultArray));
    }


}

