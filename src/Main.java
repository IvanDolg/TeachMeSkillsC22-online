public class Main {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard(100);

        visa.addMoney(1000);

        System.out.println(visa);

    }
}

