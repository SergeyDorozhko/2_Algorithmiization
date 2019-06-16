package by.epam.my_study.decomposition;

public class Decomposition6 {
     /*
    Написать метод, проверяющий, являются ли 3 числа взаимно простые.
     */

    public static void main(String[] args){
        int one = 5;
        int two = 18;
        int three = 29;

        simpleNumbers(one, two, three);

    }

    public static void simpleNumbers(int numberOne, int numberTwo, int numberThree){

        int generalDeviderOneTwo = 1;
        int generalDeviderTwoThree = 1;
        int generalDeviderOneThree = 1;
        if(Math.abs(numberOne) > Math.abs(numberTwo)){

            for(int i = 1; i <= Math.abs(numberTwo); i++ ){
                if(numberOne % i == 0 && numberTwo % i == 0){
                    generalDeviderOneTwo = i;
                }
            }
        }else{
            for(int i = 1; i <= Math.abs(numberOne); i++ ){
                if(numberOne % i == 0 && numberTwo % i == 0){
                    generalDeviderOneTwo = i;
                }
            }
        }

        if(generalDeviderOneTwo < 2){
            System.out.println("Number " + numberOne + " and number" + numberTwo + " are general simple");
        }else{
            System.out.println("Number " + numberOne + " and number" + numberTwo + " are NOT general simple");
        }


        if(Math.abs(numberOne) > Math.abs(numberThree)){

            for(int i = 1; i <= Math.abs(numberThree); i++ ){
                if(numberOne % i == 0 && numberThree % i == 0){
                    generalDeviderOneThree = i;
                }
            }
        }else{
            for(int i = 1; i <= Math.abs(numberOne); i++ ){
                if(numberOne % i == 0 && numberThree % i == 0){
                    generalDeviderOneThree = i;
                }
            }
        }

        if(generalDeviderOneThree < 2){
            System.out.println("Number " + numberOne + " and number" + numberThree + " are general simple");
        }else{
            System.out.println("Number " + numberOne + " and number" + numberThree + " are NOT general simple");
        }



        if(Math.abs(numberTwo) > Math.abs(numberThree)){

            for(int i = 1; i <= Math.abs(numberThree); i++ ){
                if(numberTwo % i == 0 && numberThree % i == 0){
                    generalDeviderTwoThree = i;
                }
            }
        }else{
            for(int i = 1; i <= Math.abs(numberTwo); i++ ){
                if(numberTwo% i == 0 && numberThree % i == 0){
                    generalDeviderTwoThree = i;
                }
            }
        }

        if(generalDeviderTwoThree < 2){
            System.out.println("Number " + numberTwo + " and number" + numberThree + " are general simple");
        }else{
            System.out.println("Number " + numberTwo + " and number" + numberThree + " are NOT general simple");
        }


        if(generalDeviderOneTwo == 1 && generalDeviderTwoThree == 1 && generalDeviderOneThree == 1){
            System.out.println("All numbers are general simple");
        }else {
            System.out.println("This numbers are NOT general simple");
        }




    }
}
