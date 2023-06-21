package Task1;

public class TwoDimensionalVector implements VectorMethods{
    private int firstCoordinate;
    private int secondCoordinate;
    static String information = "This is a vector for a two-dimensional coordinate system";
    public TwoDimensionalVector(int firstCoordinate, int secondCoordinate){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
    }
    @Override
    public String toString() {
        return "---------------------------------------------" +
                "\n" + information + ", its coordinates:" +
                "\nx: " + this.firstCoordinate +
                "\ny: " + this.secondCoordinate;
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
