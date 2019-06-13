package by.epam.my_study.decomposition;

import java.util.Scanner;

public class Decomposition2 {
    /*
    Hаписать метод  для нахождения НОД четырех натуральных чисел
     */
    public static int greatestCommonDivisor(int numberOne, int numberTwo, int numberThree, int numberFour ){
        int minOfNumbers = Math.min(Math.min(numberOne, numberTwo), Math.min(numberThree, numberFour));
        int gCD = 0;
        for(int i = 1; i <= minOfNumbers; i++ ){
            if(numberOne % i == 0 && numberTwo % i == 0 && numberThree % i == 0 && numberFour % i == 0){
                gCD = i;
            }
        }
        return gCD;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int one = scan.nextInt();
        System.out.println("Input second number: ");
        int two = scan.nextInt();
        System.out.println("Input third number: ");
        int three = scan.nextInt();
        System.out.println("Input fourth number: ");
        int four = scan.nextInt();


        System.out.println("Greatest common divisor of this numbers is " + greatestCommonDivisor(one, two, three, four));


    }
}
