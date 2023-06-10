package hometask_8_2_Task_1;
public class Circle extends Figure{
    private  double radius;
    public Circle (int radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * getRadius() * 3.14;
    }
    @Override
    public double getSquare() {
        return Math.pow(getRadius(), 2) * 3.14;
    }
    public String toString(){
        return "\n-----------------------------------------------------" +
                "\nCircle  radius is: " + this.getRadius() +
                "\nCircle  perimeter is: " + getPerimeter() +
                "\nCircle  square is: " + getSquare();
    }
}
