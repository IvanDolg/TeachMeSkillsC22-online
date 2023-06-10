package hometask_8_2_Task_1;
public class Triangle extends Figure{
    private double firstSide;
    private double secondSide;
    private double thirdSide;
    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    public double getFirstSide() {
        return firstSide;
    }
    public double getSecondSide() {
        return secondSide;
    }
    public double getThirdSide() {
        return thirdSide;
    }
    public double getPerimeter(){
        return (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
    }
    public double getSquare(){
        return  Math.sqrt(getPerimeter() * (getPerimeter() - firstSide) * (getPerimeter() - secondSide) *
                (getPerimeter() - thirdSide));
    }
    public String toString(){
        return "\n-----------------------------------------------------" +
                "\nFirst triangle side is: " + this.firstSide +
                "\nSecond triangle side is: " + this.secondSide +
                "\nThird triangle side is: " + this.thirdSide +
                "\nTriangle perimeter is: " + getPerimeter() +
                "\nTriangle Square is: " + getSquare();
    }
}
