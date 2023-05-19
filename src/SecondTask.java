import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
* Создать программу, которая будет принимать один символ и выводить в
* консоль символическое значение, а на следующей строчке его численное.*/
public class SecondTask {

    // Решение задания с испольпользованием Scanner
    public static void symbol(){
        System.out.println("\n\t\t\t ---- SECOND TASK ----\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите символ: ");

        char symbol = scanner.next().charAt(0);

        System.out.println("Ваш символ: " + symbol);
        System.out.println("Символьное значение символа: " + (int)symbol);
    }

    // Решение задания с испольпользованием Javax
    public  static  void symbolJavaX(){
        String symbol = JOptionPane.showInputDialog("Введиет символ: ");
        char ch = symbol.charAt(0);
        JOptionPane.showMessageDialog(null, "Символ: " + symbol + "\n" + "Номер символа: " + (int) ch);
    }

}