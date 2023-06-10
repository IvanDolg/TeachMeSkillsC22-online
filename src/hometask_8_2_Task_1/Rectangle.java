package hometask_8_2_Task_1;
public class Rectangle extends Figure{
    private double firstSide;
    private double secondSide;
    public  Rectangle(double firstSide, double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }
    public double getFirstSide() {
        return firstSide;
    }
    public double getSecondSide() {
        return secondSide;
    }
    @Override
    public double getPerimeter(){
        return 2 * (getFirstSide() + getSecondSide());
    }
    @Override
    public double getSquare() {
        return getFirstSide() * getSecondSide();
    }
    public String toString(){
        return "\n-----------------------------------------------------" +
                "\nFirst rectangle side is: " + this.firstSide +
                "\nSecond rectangle side is: " + this.secondSide +
                "\nRectangle perimeter is: " + getPerimeter() +
                "\nRectangle Square is: " + getSquare();
    }
}
