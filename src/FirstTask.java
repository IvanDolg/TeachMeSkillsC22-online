import javax.swing.JOptionPane;
import java.util.Scanner;

/*                     -Task-
Создадим программу, которая принимает следующие параметры:
имя, фамилия, возраст, рост,  вес.  Данные должны выводить
информацию на экран.*/
public class FirstTask {
    public static void setData(){
        String name;
        String surname;
        int age;
        int weight;

        name = JOptionPane.showInputDialog("Ввод Имени");
        surname = JOptionPane.showInputDialog("Ваод Фамилии");
        age = Integer.parseInt(JOptionPane.showInputDialog("Ввод возраста"));
        weight = Integer.parseInt(JOptionPane.showInputDialog("Ввод веса"));
        JOptionPane.showMessageDialog(null,"Имя: "+name + "\n" + "Фамилия: "+surname + "\n" + "Возраст: " + age + "\n" + "Вес: " + weight);
    }
    public static void setDatanew (){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите вес: ");
        int weight = scanner.nextInt();

        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Вес: " + weight + " кг");

    }
}
