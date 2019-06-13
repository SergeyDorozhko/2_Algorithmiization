package by.epam.my_study.decomposition;

public class Decomposition3 {
    /*
    Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треуглиника.
     */

    public static double triangleArea (int sideOfRegularTriangle){    //площадь правильного треугольника
        double area = Math.sqrt(3) / 4 * Math.pow(sideOfRegularTriangle, 2);
        return area;
    }


    public static void main(String[] args){
       int hexagoneSide = 8;
       double hexagoneArea = 6 * triangleArea(hexagoneSide);  // правильный шестиугольник состоит из 6 правильных треугольников
        System.out.println("result " + hexagoneArea);
    }
}
