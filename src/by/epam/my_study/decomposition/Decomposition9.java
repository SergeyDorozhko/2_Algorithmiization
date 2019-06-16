package by.epam.my_study.decomposition;

public class Decomposition9 {
    /*
    Даны числа X Y Z T  - длнны сторон четырехугольника. Написать метод вычисления его площади, если угол между сторонами Х и У прямой.
     */
    public static void main(String[] args){
        int x = 5;
        int y = 8;
        int z = 6;
        int t = 9;
        square(x,y,z,t);
    }

    public static void square(int sideOne, int sideTwo, int sideThree, int sideFour){

        /*
        найдем плоадь как сумму площадей двух треугольников прямого нак половину произведения двух катетов, и второго как
        произведение полупериметра и разности полпериметра е его стороны.
         */

        double squareFirstTriangle = sideOne * sideTwo / 2;


        double hepotinuza  = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));

        double halfPerimetrOfSecondTriangle = (hepotinuza + sideThree + sideFour) / 2;
        double squareOfSecondTriangle;

        if(sideThree + sideFour > hepotinuza && hepotinuza + sideThree >= sideFour && hepotinuza + sideFour >= sideThree){
            squareOfSecondTriangle = Math.sqrt(halfPerimetrOfSecondTriangle * (halfPerimetrOfSecondTriangle - hepotinuza) * (halfPerimetrOfSecondTriangle - sideThree) * (halfPerimetrOfSecondTriangle -sideFour));
        }else {
            System.out.println("Quadrilateral with sides like this does not exist.");
            squareOfSecondTriangle = squareFirstTriangle * (-1);
        }
        double square = squareFirstTriangle + squareOfSecondTriangle;
        System.out.println("square of quadrilateral is " + square);
    }
}
