import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
 * Напишем программу, которая принимает на вход вес и рост.
 * После этого выводит на экран BMI */
public class ThirdTask {
    public static void thirdTask(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите рост: ");
        double height = scanner.nextDouble();

        System.out.println("Введиет вес: ");
        double weight = scanner.nextDouble();

        System.out.println("Вес: " + weight);
        System.out.println("Рост: " + height);
        System.out.println("BMI: " + weight/(height*height));
    }
    public static void getData1(){
        double height;
        double weight;

        height = Double.parseDouble(JOptionPane.showInputDialog("Ввод роста"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Ввод веса"));
        JOptionPane.showMessageDialog(null,"Рост: " + height + "\n" + "Вес: " + weight + "\n" + "BMI: " + weight/(height*height));
    }
}
