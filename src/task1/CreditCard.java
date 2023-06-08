package task1;
public class CreditCard {
    private final String accountNumber;
    private int totalSum;
    public CreditCard(String accountNumber, int totalSum){
        this.accountNumber = accountNumber;
        this.totalSum = totalSum;
    }
    public int getTotalSum(){
        return totalSum;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void addMoney(int accuryual){
        totalSum += accuryual;
    }
    public void takeMoneyOff(int money){
        totalSum -= money;
    }
    public String toString(){
        return "Amount of money is: " + this.totalSum +
                " Credit card number: " + this.accountNumber;
    }
}
