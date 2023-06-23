package Task1;
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
        twoDimensionalVector.vectorComparison(twoDimensionalVector, twoDimensionalVector1);

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
        threeDimensionalVector.vectorComparison(threeDimensionalVector, threeDimensionalVector1);

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
