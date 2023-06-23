package Task1;

/*      1 Создайте класс, который описывает вектор в двумерной системе
        координат.
        Создайте класс, который описывает вектор в трехмерной системе
        координат.

        У каждого класса должны быть:
        - конструктор с параметрами в виде списка координат (например, x,
        y, z);

        - метод, вычисляющий длину вектора. Корень можно посчитать с
        помощью Math.sqrt();
        - метод, вычисляющий скалярное произведение;
        - метод сложения векторов;
        - метод разности векторов;
        - статический метод, который принимает целое число N, и
        возвращает массив случайных векторов размером N.

        Предусмотреть метод сравнение векторов.
        Предусмотреть метод для вывода информации о векторе.

        Каждый из классов должен иметь константу, содержащею описание
        вектора.
        Например, "Это вектор для двумерной системы координат".
        Эта константа так же должна выводиться в методе для вывода
        информации о векторе.*/

public class Main {
    public static void main(String[] args) {
        TwoDimensionalVector twoDimensionalVector = new TwoDimensionalVector(9, 5);
        TwoDimensionalVector twoDimensionalVector1 = new TwoDimensionalVector(9,3);
        ThreeDimensionalVector threeDimensionalVector = new ThreeDimensionalVector(8,8,7);
        ThreeDimensionalVector threeDimensionalVector1 = new ThreeDimensionalVector(7,8,2);

        System.out.println("The first vector: " + twoDimensionalVector);
        twoDimensionalVector.vectorLength();
        System.out.println("The second vector: " + twoDimensionalVector1);
        threeDimensionalVector1.vectorLength();
        System.out.println("---------------------------------------------");
        twoDimensionalVector.scalarProduct(twoDimensionalVector, twoDimensionalVector1);
        twoDimensionalVector.additionOfVectors(twoDimensionalVector, twoDimensionalVector1);
        twoDimensionalVector.vectorDifference(twoDimensionalVector, twoDimensionalVector1);
        System.out.println("--------------------------------------------");
        TwoDimensionalVector[] twoDimensionalVectors = TwoDimensionalVector.staticMethod(2);
        System.out.println(twoDimensionalVectors[0]);
        System.out.println(twoDimensionalVectors[1]);

        System.out.println("---------------------------------------------");
        System.out.println("The first vector: " + threeDimensionalVector);
        threeDimensionalVector.vectorLength();
        System.out.println("The second vector: " + threeDimensionalVector1);
        threeDimensionalVector1.vectorLength();
        System.out.println("---------------------------------------------");
        threeDimensionalVector.scalarProduct(threeDimensionalVector, threeDimensionalVector1);
        threeDimensionalVector.additionOfVectors(threeDimensionalVector, threeDimensionalVector1);
        threeDimensionalVector.vectorDifference(threeDimensionalVector, threeDimensionalVector1);
        System.out.println("---------------------------------------------");
        ThreeDimensionalVector[] threeDimensionalVectors = ThreeDimensionalVector.staticMethod(2);
        System.out.println(threeDimensionalVectors[0]);
        System.out.println(threeDimensionalVectors[1]);
    }
}
