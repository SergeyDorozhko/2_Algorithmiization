package by.epam.my_study.decomposition;

public class Decomposition7 {
    /*
       написать метод для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
        */
    public static void main(String[] args){
        int oddFactorialTo = 9;
        Decomposition7 start = new Decomposition7();
        start.nOddFactorial(oddFactorialTo);
    }


    public void nOddFactorial(int number){
        int summFactorial = 0;

        for (int i = 1; i <= number; i+=2){
            long factorial = 1;
            for  (int j = 1; j <= i; j++ ){
                factorial *= j;
            }
            System.out.println("Factorial of number " + i + " is  " + factorial);

            summFactorial += factorial;
        }

        System.out.println("\nSumm of add numbers factorials from 1 to 9 is " + summFactorial);
    }
}
