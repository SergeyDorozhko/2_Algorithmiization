package by.epam.my_study.decomposition;

public class Decomposition17 {
    /*
    Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр.Сколько таких действий необходимо
    произвести, чтобы получить нуль?
     */
    public static void main(String[] args){
        int number = 813;

        int countItaration = 0;
        do{
            number = subtraction(number, sumOfNumbersFromNumber(number));
            countItaration++;
        }while (number > 0);
        System.out.println("Number of steps is " + countItaration);

    }




    public static int sumOfNumbersFromNumber(int number){
        int sum = 0;
        do{
            sum += number % 10;
            number /= 10;

        }while(number > 0);
 //       System.out.println("sum is " + sum);
        return sum;
    }




    public static int subtraction(int numberFrom, int howMuch){
        int result = numberFrom - howMuch;
//        System.out.println("number is" + result);
        return result;
    }


}
