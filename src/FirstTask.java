import javax.swing.JOptionPane;
import java.util.Scanner;

/*                     -Task-
* Создать программу, которая с помощью класса Scanner принимает
* следующие данные: имя, фамилия, возраст, рост и вес. Эти данные
* должны храниться в соответствующих переменных.*/
public class FirstTask {

    // Solving a task using Scanner
    public static void setPersonParametes (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.print("Enter a surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the weight: ");
        int weight = scanner.nextInt();

        System.out.println("\nName: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");

    }

    // Solving a task using Javax
    public static void setPersonParametesJavaX(){
        String name;
        String surname;
        int age;
        int weight;

        name = JOptionPane.showInputDialog("Enter a name: ");
        surname = JOptionPane.showInputDialog("Enter a surname: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age: "));
        weight = Integer.parseInt(JOptionPane.showInputDialog("Enter the weight: "));
        JOptionPane.showMessageDialog(null,"Name: "+ name + "\n" +
                "Surname: " + surname + "\n" + "Age: " + age + " years" + "\n" + "Weight: " + weight + " kg");
    }
}