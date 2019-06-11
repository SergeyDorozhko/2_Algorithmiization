package by.epam.my_study.masiv_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort1 {
/*
Заданы два одномерных массива с различным количеством элементов и натуральное число К.
Объединить их в один массив , включив второй массив между К-м и К+1 элементами первого, при этом не используя дополнительный массив.
 */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the length of first Array: ");
        int firstArrayLength = scan.nextInt();

        int [] firstArray = new int[firstArrayLength];
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = (int) (Math.random()*10);
        }
        System.out.println("first Array is :" + Arrays.toString(firstArray));


        System.out.println("Input the length of second Array : ");
        int secondArrayLength = scan.nextInt();

        int [] secondArray = new int[secondArrayLength];
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = (int) (Math.random()*20);
        }
        System.out.println("second Array is: " + Arrays.toString(secondArray));


        System.out.println("Input element nnumber after which insert second array to first array: ");
        int insertAfter = -1;
        do {
            insertAfter = scan.nextInt();
            if(insertAfter < 0 || insertAfter >= firstArray.length){
                System.out.println("incorrect number, try one more");
            }
        }while(insertAfter < 0 || insertAfter >= firstArray.length);


        int [] resultArray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < resultArray.length; i++){
            if(i <= insertAfter) {
//                System.out.println("fi = " + i);
                resultArray[i] = firstArray[i];
            }else if(i > insertAfter && i < (insertAfter + secondArray.length)){
                for(int j = 0; j < secondArray.length; j++,i++){
                    resultArray[i] = secondArray[j];
//                    System.out.println(i);
                }
                i--;                                                //на последнем шаге получается дврйное добавление, защет чего пропускается 1 символ
            }else{
 //               System.out.println("i =" + i + "fist = " + secondArray.length);
                resultArray[i] = firstArray[i - secondArray.length];
 //               System.out.println("b");
            }
        }
        System.out.println("result" + Arrays.toString(resultArray));
    }
}
