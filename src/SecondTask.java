import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
* Создать программу, которая будет принимать один символ и выводить в
* консоль символическое значение, а на следующей строчке его численное.*/
public class SecondTask {

    // Solving a task using Scanner
    public static void symbol(){
        System.out.println("\n\t\t\t ---- SECOND TASK ----\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter symbol: ");

        char symbol = scanner.next().charAt(0);

        System.out.println("Your symbol: " + symbol);
        System.out.println("Symbolic value: " + (int)symbol);
    }

    // Solving a task using Javax
    public  static  void symbolJavaX(){
        String symbol = JOptionPane.showInputDialog("Enter symbol: ");
        char ch = symbol.charAt(0);
        JOptionPane.showMessageDialog(null, "Symbol: " + symbol + "\n"
                + "Symbolic value: " + (int) ch);
    }
}