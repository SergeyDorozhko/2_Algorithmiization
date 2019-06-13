package by.epam.my_study.decomposition;

import java.util.Scanner;

public class Decomposition1 {
/*
Написать метод (методы) для нахождения НОК и НОД двух натуральных чисел.
 */


    public int greatestCommonDivisor(int firstNumber, int secondNumber){
        int minOfTwoNumbers;
        if(firstNumber < secondNumber){
            minOfTwoNumbers = firstNumber;
        }else{
            minOfTwoNumbers = secondNumber;
        }

        int greatestCommonDivisor = -1;
        for(int i = 1; i < minOfTwoNumbers; i++){
            if(firstNumber % i == 0 && secondNumber % i == 0){
                greatestCommonDivisor = i;

            }
        }
        return greatestCommonDivisor;
    }

    public int leastCommonMultiple(int firstNumber, int secondNumber,int greatestCommonDivisor){
        int leastCommonMultiple = firstNumber * secondNumber / greatestCommonDivisor;
        return leastCommonMultiple;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Input second number: ");
        int secondNum = scan.nextInt();

        Decomposition1 lCM = new Decomposition1();
        int greatestCommonDivisor = lCM.greatestCommonDivisor(firstNum, secondNum);
        int leastCommonMultiple = lCM.leastCommonMultiple(firstNum, secondNum, greatestCommonDivisor);
        System.out.println("Least common multiple of " + firstNum + " and " + secondNum + " is " + leastCommonMultiple + ".\nGeatest common divisor of this one is " + greatestCommonDivisor);

    }
}
