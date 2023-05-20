import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
 * Создать программу, которая принимает на входе следующие значения: вес и
 * рост. После этого выводит на экран т.н. BMI (Body Mass Index).*/
public class ThirdTask {

    // Solving a task using Scanner
    // When entering fractional values, use " , " !!!
    public static void bodyMassIndex(){
        System.out.println("\n\t\t\t ---- THIRD TASK ----\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight: ");
        double weight = scanner.nextDouble();

        double bmi = weight/(height*height);
        String result = String.format("%.3f",bmi);

        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI: " + result + " kg/m^2");
    }

    // Solving a task using Javax
    // When entering fractional values, use " . " !!!
    public static void bodyMassIndexJavaX(){

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height: "));
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight: "));

        double bmi = (weight/(height*height));
        String result = String.format("%.3f",bmi);

        JOptionPane.showMessageDialog(null,"Height: " + height +" m"+ "\n"
                + "Weight: " + weight + " kg"+ "\n" + "BMI: " + result + " kg/m^2");
    }
}