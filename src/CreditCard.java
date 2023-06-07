import java.util.Scanner;

public class CreditCard {
    private int accountNumber;
    private int totalSum;
    public CreditCard(int totalSum){
        this.totalSum = totalSum;
    }
    public CreditCard(int accountNumber, int totalSum){
        this.accountNumber = accountNumber;
        this.totalSum = totalSum;
    }
    public int getTotalSum(){
        return totalSum;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setTotalSum(int totalSum){
        this.totalSum = totalSum;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void addMoney(int accuryual){
        totalSum += accuryual;
    }
    public String toString(){
        return "Total sum: " + this.totalSum;
    }
}
