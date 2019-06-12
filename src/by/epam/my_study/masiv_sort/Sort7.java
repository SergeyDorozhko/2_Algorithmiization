package by.epam.my_study.masiv_sort;

public class Sort7 {
    /*
    Пусть даны две неубывающие последовательноси действительных чисел. Требуется указать те места, на которые нужно вставить
    элементы последооватеьности Б в первую последовательность так , чтобы новая носледовательность оставалась возрастающей.
     */

    public static void main(String[] args){
        int [] firstArray = {1, 3, 4, 5, 8, 9, 11, 19};
        int [] secondArray = {2, 3, 6, 7, 9, 13, 22, 25, 38};


        int i = 0;
        int j = 0;
        do{
            if(i < firstArray.length && j < secondArray.length) {
                if (firstArray[i] > secondArray[j]) {
                    System.out.println("insert b[" + j + "]" + " before a[" + i + "]");
                    if (j < secondArray.length) {
                        j++;
                    }
                } else {
                    if (i < firstArray.length) {
                        i++;
                    }
                }
            }else if(j < secondArray.length){
                System.out.println("Insert b[" + j + "] - b[" + (secondArray.length-1) + "] after the last element of array A");
                break;
            }else{
                break;
            }
        }while(i < firstArray.length || j < secondArray.length);

    }
}
