import javax.swing.JOptionPane;

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
}
