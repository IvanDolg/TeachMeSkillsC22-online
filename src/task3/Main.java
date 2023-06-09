package task3;
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(4, 7,7);
        System.out.println(atm);

        System.out.println("\nAfter adding money to the ATM: ");
        atm.addMoney(20, 21);
        System.out.println(atm);

        System.out.println("\nWithdrawing money from an ATM:");
        System.out.println("Money withdrawal operation: " + atm.withdrawalOfMoney(1170));

        System.out.println("\nNominal value of banknotes: ");
        atm.giveMoney(290);

        System.out.println("\nThe rest of the money in the ATM after withdrawal: ");
        System.out.println(atm);
    }
}
