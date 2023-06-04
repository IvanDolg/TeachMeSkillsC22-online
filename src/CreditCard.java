import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        int accountNumber;
        int totalSum;

        sumForLoan();
    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static void sumForLoan(){
        System.out.print("Enter the amount of debt: ");
        double amountOfDebt = scanner().nextDouble();

        System.out.print("Enter the interest rate (as a percent): ");
        double interestRate = scanner().nextDouble();
        interestRate /= 100;

        System.out.print("Enter the period for which the amount was taken (in days): ");
        int period = scanner().nextInt();

        System.out.print("The amount of interest for the reporting period: ");
        double amountOfInterest = ((amountOfDebt * interestRate) / 365) * period;
        System.out.print(Math.round(amountOfInterest) + "\n");

        System.out.print("Total loan amount: ");
        double totalAmount = (amountOfInterest * period) + amountOfDebt;
        System.out.print(Math.round(totalAmount));

    }
}
