package task2;

public class Main {
    public static void main(String[] args) {
        Pc computer1 = new Pc(100000, "Acer");

        HDD hdd = new HDD("Seagate Skyhawk Surveillance", 8, "external");
        RAM ram = new RAM("HP Optane PMem", 256);
        Pc computer2 = new Pc(150000, "Asus", hdd, ram);

        System.out.println("The work of the first constructor:");
        System.out.println(computer1);
        System.out.println("\nThe work of the second constructor:");
        System.out.println(computer2);

    }
}
