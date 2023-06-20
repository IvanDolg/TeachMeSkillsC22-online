package hometask_8_2_Task_2;
public class Main {
    public static void main(String[] args) {
        Employee Ivan = new Director("Ivan", 19, "Minsk", "director");
        Employee Irina = new Director("Irina", 50, "Moscow", "worker");
        Employee Vladimir = new Director("Vladimir", 34, "London", "accountant");

        System.out.println(Ivan.toString());
        System.out.println(Irina.toString());
        System.out.println(Vladimir.toString());

        System.out.println("---------------------------------------------------");
        Ivan.getPosition();
        Irina.getPosition();
        Vladimir.getPosition();

    }
}
