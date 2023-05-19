import javax.swing.*;
public class HomeWork {
    public static void main(String[] args) {

        int chose = Integer.parseInt(JOptionPane.showInputDialog("Как вы хотите видеть выполнение задания" +
                "\n1, если через консоль" +
                "\n2, если через графический интерфейс" +
                "\nВаш выбор: "));

        switch (chose){
            case 1:
                FirstTask.setPersonParametes();
                SecondTask.symbol();
                ThirdTask.bodyMassIndex(); // При введении дробных значений использовать " , "
                break;

            case 2:
                FirstTask.setPersonParametesJavaX();
                SecondTask.symbolJavaX();
                ThirdTask.bodyMassIndexJavaX();// При введении дробных значений использовать " . "
                break;
        }
    }
}