import javax.swing.*;
import java.util.Scanner;

/*                     -Task-
* Создадим программу, которая будет принимать один символ и выводить символьное значение. */
public class SecondTask {
    public static void mySymbol(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter an integer meaning of the symbol: ");

        char symbol = scanner.next().charAt(0);

        System.out.println(symbol);
        System.out.println((int)symbol);
    }

    public  static  void mySymbolNew(){
        String symbol = JOptionPane.showInputDialog("Ввод символа ");
        char ch = symbol.charAt(0);
        JOptionPane.showMessageDialog(null, "Символ: " + symbol + "\n" + "Номер символа: " + (int) ch);
    }

}
