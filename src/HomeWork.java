import javax.swing.*;
public class HomeWork {
    public static void main(String[] args) {

        int chose = Integer.parseInt(JOptionPane.showInputDialog("How do you want to see the task completed" +
                "\n1, if via the console" +
                "\n2, if through the graphical interface" +
                "\n3, if you want to get out " +
                "\nYour choice: "));

        switch (chose){
            // Solving a task using Scanner
            case 1:
                FirstTask.setPersonParametes();
                SecondTask.symbol();
                ThirdTask.bodyMassIndex(); // When entering fractional values, use " , "
                break;

            // Solving a task using Javax
            case 2:
                FirstTask.setPersonParametesJavaX();
                SecondTask.symbolJavaX();
                ThirdTask.bodyMassIndexJavaX();// When entering fractional values, use " . "
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Enter the correct number");
        }
    }
}