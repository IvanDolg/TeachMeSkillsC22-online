import javax.swing.*;

/*                     -Task-
 * Напишем программу, которая принимает на вход вес и рост.
 * После этого выводит на экран BMI */
public class ThirdTask {
    public static void getData1(){
        double height;
        double weight;

        height = Double.parseDouble(JOptionPane.showInputDialog("Ввод роста"));
        weight = Double.parseDouble(JOptionPane.showInputDialog("Ввод веса"));
        JOptionPane.showMessageDialog(null,"Рост: " + height + "\n" + "Вес: " + weight + "\n" + "BMI: " + weight/(height*height));
    }
}
