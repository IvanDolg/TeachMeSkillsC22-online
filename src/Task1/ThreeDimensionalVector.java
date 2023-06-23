package Task1;

public class ThreeDimensionalVector implements VectorMethods{
    private double firstCoordinate;
    private double secondCoordinate;
    private double thirdCoordinate;
    static String information = "This is a vector for a three-dimensional coordinate system";
    public ThreeDimensionalVector(double firstCoordinate, double secondCoordinate, double thirdCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
    }
    public void scalarProduct(ThreeDimensionalVector threeDimensionalVector, ThreeDimensionalVector threeDimensionalVector1) {
        double result;
        result = (threeDimensionalVector.firstCoordinate * threeDimensionalVector1.firstCoordinate +
                threeDimensionalVector.secondCoordinate * threeDimensionalVector1.secondCoordinate +
                threeDimensionalVector.thirdCoordinate * threeDimensionalVector1.thirdCoordinate);
        System.out.println("Vector scalar product: " + result);
    }
    public void additionOfVectors(ThreeDimensionalVector threeDimensionalVector, ThreeDimensionalVector threeDimensionalVector1) {
        double x = threeDimensionalVector.firstCoordinate + threeDimensionalVector1.firstCoordinate;
        double y = threeDimensionalVector.secondCoordinate + threeDimensionalVector1.secondCoordinate;
        double z = threeDimensionalVector.thirdCoordinate + threeDimensionalVector1.thirdCoordinate;
        System.out.println("Coordinates after addition: " + "(" + x + ", " + y + ", " + z + ")");
    }
    public void vectorDifference(ThreeDimensionalVector threeDimensionalVector, ThreeDimensionalVector threeDimensionalVector1) {
        double x = threeDimensionalVector.firstCoordinate - threeDimensionalVector1.firstCoordinate;
        double y = threeDimensionalVector.secondCoordinate - threeDimensionalVector1.secondCoordinate;
        double z = threeDimensionalVector.thirdCoordinate - threeDimensionalVector1.thirdCoordinate;
        System.out.println("Coordinates after  subtraction: " + "(" + x + ", " + y + ", " + z + ")");
    }
    public static ThreeDimensionalVector[] staticMethod(int number) {
        ThreeDimensionalVector[] threeDimensionalVectors = new ThreeDimensionalVector[number];
        for (int i = 0; i < number; i++) {
            threeDimensionalVectors[i]= new ThreeDimensionalVector(Math.random(), Math.random(), Math.random());
        }
        return threeDimensionalVectors;
    }
    public void vectorComparison() {

    }
    @Override
    public String toString() {
        return "\n" + information + ", its coordinates:" +
                "\nx: " + this.firstCoordinate +
                "\ny: " + this.secondCoordinate +
                "\nz: " + this.thirdCoordinate;
    }
    @Override
    public void vectorLength() {
        double result;
        result = Math.sqrt(Math.pow(firstCoordinate, 2) + Math.pow(secondCoordinate, 2) + Math.pow(thirdCoordinate, 2));
        System.out.println("Vector length: " + result);

    }
}
