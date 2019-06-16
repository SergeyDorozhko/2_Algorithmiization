package by.epam.my_study.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Decomposition4 {
        /*
    На плоскости заданы своими координатами N точек. Написать метод который определяет между какими из нар точек сомое большое растояние.
    Координаты точек занести  в массив.
     */

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of Dots:");
        int numberOfDots = scan.nextInt();
        int [][] dots = new int[numberOfDots][2];

        ramdomDots(dots);
        for (int i = 0; i < dots.length; i++) {

            System.out.println(Arrays.toString(dots[i]));
        }
        int [] betweenDots = maxSigmetsLengthBetween(dots);
        System.out.println("Max distance between dots: " + Arrays.toString(betweenDots));

    }



    public static int [][] ramdomDots(int [][] arrayDots){
        for (int i = 0; i < arrayDots.length; i++){
            for (int j = 0; j < arrayDots[i].length; j++){
                arrayDots[i][j] = (int)(Math.random()*20 - 5);
            }
        }
        return arrayDots;
    }

    public static int[] maxSigmetsLengthBetween(int [][] arrayDots){
        double maxSigmetsLength = 0;
        double sigmentLength = 0;

        int[] betweenDots = new int[2];
        for(int i = 0; i < arrayDots.length; i++){
            for (int j = 1; j < arrayDots.length; j++){
                sigmentLength = Math.sqrt(Math.pow((arrayDots[i][0] - arrayDots[j][0]), 2) + Math.pow((arrayDots[i][1] - arrayDots[j][1]) , 2));
                if (sigmentLength > maxSigmetsLength){
                    maxSigmetsLength = sigmentLength;
                    betweenDots[0] = i + 1;
                    betweenDots[1] = j + 1;
                }
            }
        }
        return betweenDots;
    }
}
