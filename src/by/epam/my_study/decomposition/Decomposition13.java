package by.epam.my_study.decomposition;

import java.util.Arrays;

public class Decomposition13 {
     /*
    Два простых числа называются близницами, если они отличаются друг от друга на 2 ( наприме 41 и 43). найти
    и напеатать все пары близницов из отрезка [n, 2n], где n - заданное наураьное число больше 2.
     */


    public static void main(String[] args){
        int startSection = 18;
        int [] section = sectionMaker(startSection);
        System.out.println("We have section from " + startSection + " to " + (startSection * 2) + ", which looks like: \n" + Arrays.toString(section));
        int [][] twins = twinsFinder(section);
        System.out.println("\nAll twins of this section are: ");
        for (int [] elem : twins){
            System.out.print(Arrays.toString(elem));
        }
    }




    public static int [] sectionMaker(int startNumber){
        int [] section = new int[startNumber + 1];
        for (int i = 0; i < section.length; i++, startNumber++){
            section[i] = startNumber;
        }
        return section;
    }





    public static int [][] twinsFinder(int [] section){
        int [][] twins = new int[section.length - 2][2];

        for (int i = 0; i < section.length; i++){
            for (int j = 1; j < section.length; j++){
                if(section[i] + 2 == section[j]){
                    twins[i][0] = section[i];
                    twins[i][1] = section[j];

                    break;
                }
            }
        }
        return twins;
    }
}
