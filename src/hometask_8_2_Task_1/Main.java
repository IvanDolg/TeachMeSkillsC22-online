package hometask_8_2_Task_1;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Triangle(3,4,5),
                new Triangle(13, 14, 15),
                new Rectangle(4, 5),
                new Rectangle(6, 2),
                new Circle(10)
        };
        System.out.println(Arrays.toString(figures));
        System.out.println(getSum(figures));
    }
    public static double getSum(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures){
            sum += figure.getPerimeter();
        }
        return sum;
    }
}
