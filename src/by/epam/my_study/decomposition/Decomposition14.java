package by.epam.my_study.decomposition;

public class Decomposition14 {
    /*
    Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень
    n, равна самому числу. Найти все числа Армстронга от 1 до K.
     */

    public static void main(String[] args){
        int lastNumber = 206000;
        findArmstrong(lastNumber);
    }

    public static void findArmstrong(int lastValue){

        int isArsmtrong;

        for (int i = 1; i <= lastValue; i++){
            int powCounter = 0;
            isArsmtrong = i;
            do{
                isArsmtrong /= 10;
                powCounter++;
            }while(isArsmtrong > 0);

            isArsmtrong = i;
            int [] arrayOfNum = new int[powCounter];
            for (int j = 0; j < arrayOfNum.length; j++){
                arrayOfNum[j] = isArsmtrong % 10;
                isArsmtrong /= 10;
            }

            int sumOfNum = 0;
            for(int j = 0; j < arrayOfNum.length; j++){
                sumOfNum += arrayOfNum[j];
            }

            if (Math.pow(sumOfNum, powCounter) == i) {
                System.out.println(i);
            }

        }
    }
}
