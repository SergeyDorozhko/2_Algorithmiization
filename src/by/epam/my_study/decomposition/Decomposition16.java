package by.epam.my_study.decomposition;

public class Decomposition16 {
    /*
    Написать программу, определющую сумму n - значных чисел, содержащих только нечетные цифры. Определить также,
    сколько четных цифр в найденй сумме.
     */

    public static void main(String[] args){
        int [] array = {12315465, 13579, 848451, 951375,15, 1395753};
        int sumOfOddNum = sumOfNumOddElem(array);
        System.out.println(sumOfOddNum);
        evenNumbersCounter(sumOfOddNum);
    }

    public static int sumOfNumOddElem(int [] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            boolean takeNumber = false;
            int cheackNumber = numbers[i];
            do{
                int cheackResult = cheackNumber % 10;
                cheackNumber /=10;
                if(cheackResult % 2 != 0){
                    takeNumber = true;
                }else{
                    takeNumber = false;
                    break;
                }

            }while(cheackNumber > 0);
            if(takeNumber == true){
                sum += numbers[i];
            }
        }
        return sum;
    }


    public static void evenNumbersCounter(int number){
        int evenCounter = 0;

        do{
            int evenNum;
            evenNum = number % 10;
            number /= 10;
            if(evenNum % 2 == 0){
                evenCounter++;
            }
        }while(number > 0);
        System.out.println("Number of even numbers in result is " + evenCounter);
    }
}
