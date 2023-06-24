package Task1;

public class TwoDimensionalVector implements VectorMethods{
    private double firstCoordinate;
    private double secondCoordinate;

    // A constant containing a description of the vector.
    static String information = "This is a vector for a two-dimensional coordinate system";
    public TwoDimensionalVector(double firstCoordinate, double secondCoordinate){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }

    /* A method that calculates the scalar product. */
    public void scalarProduct(TwoDimensionalVector twoDimensionalVector, TwoDimensionalVector twoDimensionalVector1) {
        double result;
        result = (twoDimensionalVector.firstCoordinate * twoDimensionalVector1.firstCoordinate +
                twoDimensionalVector.secondCoordinate * twoDimensionalVector1.secondCoordinate);
        System.out.println("Vector scalar product: " + result);
    }

    /* Vector addition method. */
    public void additionOfVectors(TwoDimensionalVector twoDimensionalVector, TwoDimensionalVector twoDimensionalVector1) {
        double x = twoDimensionalVector.firstCoordinate + twoDimensionalVector1.firstCoordinate;
        double y = twoDimensionalVector.secondCoordinate + twoDimensionalVector1.secondCoordinate;
        System.out.println("Coordinates after addition: " + "(" + x + ", " + y + ")");
    }

    /* Vector difference method. */
    public void vectorDifference(TwoDimensionalVector twoDimensionalVector, TwoDimensionalVector twoDimensionalVector1) {
        double x = twoDimensionalVector.firstCoordinate - twoDimensionalVector1.firstCoordinate;
        double y = twoDimensionalVector.secondCoordinate - twoDimensionalVector1.secondCoordinate;
        System.out.println("Coordinates after  subtraction: " + "(" + x + ", " + y + ")");
    }

    /* A static method that takes an integer N, and returns an array of random vectors of size N. */
    public static TwoDimensionalVector[] staticMethod(int number) {
        TwoDimensionalVector[] twoDimensionalVectors = new TwoDimensionalVector[number];
        for (int i = 0; i < number; i++){
            twoDimensionalVectors[i] = new TwoDimensionalVector(Math.random(), Math.random());
        }
        return twoDimensionalVectors;
    }

    /* Vector comparison method. */
    public void vectorComparison(TwoDimensionalVector twoDimensionalVector, TwoDimensionalVector twoDimensionalVector1) {
        if (twoDimensionalVector.firstCoordinate > twoDimensionalVector1.firstCoordinate){
            System.out.println("The first element of the first vector is larger than the first element of the second vector");
        } else if (twoDimensionalVector.firstCoordinate < twoDimensionalVector1.firstCoordinate){
            System.out.println("The first element of the second vector is larger than the first element of the first vector");
        } else if (twoDimensionalVector.firstCoordinate == twoDimensionalVector1.firstCoordinate) {
            System.out.println("The first element of the first vector is equal to the first element of the second vector");
        }
        if (twoDimensionalVector.secondCoordinate  > twoDimensionalVector1.secondCoordinate){
            System.out.println("The second element of the first vector is larger than the second element of the second vector");
        } else if (twoDimensionalVector.secondCoordinate  < twoDimensionalVector1.secondCoordinate){
            System.out.println("The second element of the second vector is larger than the second element of the first vector");
        } else if (twoDimensionalVector.secondCoordinate == twoDimensionalVector1.secondCoordinate) {
            System.out.println("The second element of the first vector is equal to the second element of the second vector");
        }
    }

    /* A method for displaying information about a vector. */
    @Override
    public String toString() {
        return "\n" + information + ", its coordinates:" +
                "\nx: " + this.firstCoordinate +
                "\ny: " + this.secondCoordinate;
    }

    /* The method that calculates the length of the vector. */
    @Override
    public void vectorLength() {
        double result;
        result = Math.sqrt(Math.pow(firstCoordinate, 2) + Math.pow(secondCoordinate, 2));
        System.out.println("Vector length: " + result);
    }
}
