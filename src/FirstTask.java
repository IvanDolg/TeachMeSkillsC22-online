import javax.swing.JOptionPane;
import java.util.Scanner;

/*                     -Task-
* Создать программу, которая с помощью класса Scanner принимает
* следующие данные: имя, фамилия, возраст, рост и вес. Эти данные
* должны храниться в соответствующих переменных.*/
public class FirstTask {

    // Решение задания с испольпользованием Scanner
    public static void setPersonParametes (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите вес: ");
        int weight = scanner.nextInt();

        System.out.println("\nИмя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");

    }

    // Решение задания с испольпользованием Javax
    public static void setPersonParametesJavaX(){
        String name;
        String surname;
        int age;
        int weight;

        name = JOptionPane.showInputDialog("Введите имя: ");
        surname = JOptionPane.showInputDialog("Введите фамилию: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Введите ваш возраст: "));
        weight = Integer.parseInt(JOptionPane.showInputDialog("Введите ваш вес: "));
        JOptionPane.showMessageDialog(null,"Имя: "+ name + "\n" +
                "Фамилия: " + surname + "\n" + "Возраст: " + age + " лет" + "\n" + "Вес: " + weight + " кг");
    }
}
