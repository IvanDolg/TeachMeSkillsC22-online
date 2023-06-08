package task1;
public class Main {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard("4916989620871508",100);
        CreditCard mastercard = new CreditCard("5578843370636858", 10000);
        CreditCard unionPay = new CreditCard("6087993287692342", 120000);

        System.out.println(visa);
        System.out.println(mastercard);
        System.out.println(unionPay);

        visa.addMoney( 1010);
        mastercard.addMoney(2200);
        unionPay.takeMoneyOff(3450);

        System.out.println("\n\nAmount of money after replenishment on visa: " + visa.getTotalSum() +
                "\nCard number: " + visa.getAccountNumber());
        System.out.println("\nAmount of money after replenishment on mastercard: " + mastercard.getTotalSum() +
                "\nCard number: " + mastercard.getAccountNumber());
        System.out.println("\nAmount of money after debiting: " + unionPay.getTotalSum() +
                "\nCard number: " + unionPay.getAccountNumber());
    }
}

