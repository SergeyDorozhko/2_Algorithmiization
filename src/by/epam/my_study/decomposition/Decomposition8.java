package by.epam.my_study.decomposition;


public class Decomposition8 {
    /*
    задан массив D. определить следующие суммы от D1 до D3, от D3 до D5,от D 4 до D6;
     */

    public static void main(String[] args){
        int [] array = {8, 15, 3, 19, 25, 65, 75, 83, 36};
        int from = 5;
        int to = 7;
        System.out.println("Summ of elemennrts from " + from + " to " + to + " is " + summArrayElem(array, from, to));


    }
    public static int summArrayElem(int [] array, int from, int to){
        int summOfElemmIs = 0;
        if(from >= 0 && to < array.length && from <= to) {
            for (int i = from; i <= to; i++) {
                summOfElemmIs += array[i];
            }
        }else{
            System.out.println("Your elemm number out of array range.So Exit with summ = 0");

        }
        return summOfElemmIs;
    }
}
