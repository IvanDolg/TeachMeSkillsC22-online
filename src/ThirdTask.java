import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
 * Создать программу, который принимает на входе следующие значения: вес и
 * рост. После этого выводит на экран т.н. BMI (Body Mass Index).*/
public class ThirdTask {

    // Решение задания с испольпользованием Scanner
    // При введении дробных значений использовать " , " !!!
    public static void bodyMassIndex(){
        System.out.println("\n\t\t\t ---- THIRD TASK ----\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите рост: ");
        double height = scanner.nextDouble();

        System.out.print("Введиет вес: ");
        double weight = scanner.nextDouble();

        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + height);
        System.out.println("BMI: " + weight/(height*height));
    }

    // Решение задания с испольпользованием стандартной библиотеки Javax
    // При введении дробных значений использовать " . " !!!
    public static void bodyMassIndexJavaX(){
        double height;
        double weight;

        height = Double.parseDouble(JOptionPane.showInputDialog("Введите рост: "));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Введите вес: "));
        JOptionPane.showMessageDialog(null,"Рост: " + height +" м"+ "\n"
                + "Вес: " + weight + " кг"+ "\n" + "BMI: " + weight/(height*height));
    }
}
