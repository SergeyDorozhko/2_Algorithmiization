package by.epam.my_study.decomposition;

public class Decomposition15 {
    /*
    Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность.
     */
    public static void main(String[] arga){
        int numberOrder = 2;
        growthNumberSintezator(numberOrder);
    }



    public static void growthNumberSintezator(int order){
        if(order > 1 && order <= 9 ){
            int[] array = new int[order];

            int j = 1;    //increment value
            do {
                for (int i = 0; i < array.length; i++) {
                    array[i] = j + i;

                }

                int growthNumber = 0;
                for(int i = 0; i < array.length; i++){
                    growthNumber += array[i];
                    if(i == array.length - 1){
                        continue;
                    }
                    growthNumber *=10;
                }
                System.out.println(growthNumber);
                j++;
            }while(array[array.length - 1] < 9);

        }else{
            System.out.println("Uncorrect value, there is no growth number with order" + order);
        }

    }
}
