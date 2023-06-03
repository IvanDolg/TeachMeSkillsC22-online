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
        System.out.print("Enter loan amount: ");
        int loanAmount = scanner().nextInt();

        System.out.print("Enter the interest rate (month): ");
        double interestRate = scanner().nextDouble();
        interestRate = interestRate/100/12;

        System.out.print("Enter maturity date: ");
        double maturityDate = scanner().nextDouble();

        System.out.print("The amount of the monthly payment: ");
        double amountPayment = loanAmount *  (interestRate + (interestRate/(Math.pow(1 + interestRate, maturityDate) - 1)));
        System.out.print(amountPayment);
    }
}
