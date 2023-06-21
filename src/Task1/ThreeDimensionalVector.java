package Task1;

public class ThreeDimensionalVector implements VectorMethods{
    private int firstCoordinate;
    private int secondCoordinate;
    private int thirdCoordinate;
    static String information = "This is a vector for a three-dimensional coordinate system";
    public ThreeDimensionalVector(int firstCoordinate, int secondCoordinate, int thirdCoordinate) {
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
    }
    @Override
    public String toString() {
        return "---------------------------------------------" +
                "\n" + information + ", its coordinates:" +
                "\nx: " + this.firstCoordinate +
                "\ny: " + this.secondCoordinate +
                "\nz: " + this.thirdCoordinate;
    }
    @Override
    public void vectorLength() {

    }

    @Override
    public void scalarProduct() {

    }

    @Override
    public void additionOfVectors() {

    }

    @Override
    public void vectorDifference() {

    }

    @Override
    public void staticMethod() {

    }

    @Override
    public void vectorComparison() {

    }
}
