package by.epam.my_study.masiv_sort;

import java.util.Scanner;

public class Sort8 {
    /*
    Даны дроби. Составить программу, которая приводит эти дроби у общему знаменателю и упрядочивает их в порядке возрастания.
    */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of fractions:");
        int numberOfFrac = scan.nextInt();

        int [] numenatorsArray = new int[numberOfFrac];
        int [] denumenatorsArray = new int[numenatorsArray.length];

        for(int i = 0; i < numenatorsArray.length; i++){
            numenatorsArray[i] = (int) (Math.random() * 10 + 1 );
        }

        for(int i = 0; i < denumenatorsArray.length; i++){
            denumenatorsArray[i] = (int) (Math.random() * 10 + 2);
        }

        System.out.print("Fractions: ");
        for(int i = 0; i < numenatorsArray.length; i++){
            System.out.print(numenatorsArray[i] + "/" + denumenatorsArray[i] + "; " );
        }

        /*
        to general denominator
         */
        for (int i = 0; i < numenatorsArray.length; i++){
            for (int j = 0; j < denumenatorsArray.length; j++){
                if(i != j){
                numenatorsArray[i] *= denumenatorsArray[j];
                }
            }
        }

        int generalDenominator = 1;
        for(int j = 0; j < denumenatorsArray.length; j++){
            generalDenominator*=denumenatorsArray[j];

        }
        for (int i = 0; i < denumenatorsArray.length; i++){
            denumenatorsArray[i] = generalDenominator;
        }

        System.out.print("\nFractions with general denominator: ");
        for(int i = 0; i < numenatorsArray.length; i++){
            System.out.print(numenatorsArray[i] + "/" + denumenatorsArray[i] + "; " );
        }



        /*
        sort (when we have general denumenator, if  fraction has smaller numinator, then all fraction will be smaller)
         */

        for(int i = 0; i < numenatorsArray.length - 1; i++){
            int change;
            if(i > 0){
                if(numenatorsArray[i] > numenatorsArray[i + 1]){
                    change = numenatorsArray[i];
                    numenatorsArray[i] = numenatorsArray[i + 1];
                    numenatorsArray[i + 1] = change;
                    i -= 2;
                }
            }else{
                if(numenatorsArray[i] > numenatorsArray[i + 1]) {
                    change = numenatorsArray[i];
                    numenatorsArray[i] = numenatorsArray[i + 1];
                    numenatorsArray[i + 1] = change;
                }
            }
        }

        System.out.print("\nresult: ");
        for (int i = 0; i < numenatorsArray.length; i++){
            System.out.print(numenatorsArray[i] + "/" + denumenatorsArray[i] + ", ");
        }
    }

}