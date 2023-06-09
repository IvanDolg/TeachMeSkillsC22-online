package hometask_8_1_Task_1;
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("445514458", "iPhone 13", 234);
        Phone phone2 = new Phone("296240058", "iPhone 14", 250);
        Phone phone3 = new Phone("296950496", "Xiaomi 13");

        System.out.println(phone1);
        System.out.println("--------------------------------");
        System.out.println(phone2);
        System.out.println("--------------------------------");
        System.out.println(phone1.receiveCall("Archil"));
        System.out.println(phone1.getNumber());
        System.out.println("--------------------------------");
        System.out.println(phone2.receiveCall("Ivan"));
        System.out.println(phone2.getNumber());
        System.out.println("--------------------------------");
        System.out.println(phone3);
        System.out.println("--------------------------------");
        System.out.println(phone1.receiveCall("Archil", Integer.parseInt(phone1.getNumber())));
        System.out.println("--------------------------------");
        System.out.println(phone1.sendMessage("296240058", "296950496", "298157027", "297835232"));
    }
}
