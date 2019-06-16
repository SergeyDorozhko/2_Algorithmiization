package by.epam.my_study.decomposition;

public class Decomposition11 {
    /*
   Написать метод который определяет в каком из двух чисел больше цифр.
    */
    public static void main(String[] args){
        int one = 1354678;
        int two = 5334;
        whichNumberIsLonger(one, two);
    }

    public static void whichNumberIsLonger(int firstNumber, int secondNumber){
        int firstCounter = 0;
        do{
            firstNumber /= 10;
            firstCounter++;
        }while(firstNumber > 0);

        int secondCounter = 0;
        do{
            secondNumber /= 10;
            secondCounter++;
        }while(secondNumber > 0);

        if(firstCounter > secondCounter){
            System.out.println("First number is longer");
        }else if(secondCounter > firstCounter){
            System.out.println("Second number is longer");
        }else{
            System.out.println("Number one has the sme length as the second one.");
        }
    }

}
