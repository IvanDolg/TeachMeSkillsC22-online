package task3;
public class ATM {
    private int twentyNominal;
    private int fiftyNominal;
    private int oneHundredNominal;
    public ATM (int twentyNominal, int fiftyNominal, int oneHundredNominal){
        this.twentyNominal = twentyNominal;
        this.fiftyNominal = fiftyNominal;
        this.oneHundredNominal = oneHundredNominal;
    }
    public String toString(){
        return "Number of banknotes in face value 20: " + this.twentyNominal +
                "\nNumber of banknotes in face value 50: " + this.fiftyNominal +
                "\nNumber of banknotes in face value 100: " + this.oneHundredNominal;
    }
    public void addMoney(int money, int quantity){
        if (money == 20){
            twentyNominal += quantity;
        }else if (money == 50){
            fiftyNominal += quantity;
        }else if (money == 100){
            oneHundredNominal += quantity;
        } else {
            System.out.println("incorrect nominal value");
        }
    }
    public boolean withdrawalOfMoney(double amount) {
        int totalSum = (twentyNominal * 20) + (fiftyNominal * 50) + (oneHundredNominal * 100);
        if (totalSum < amount){
            return false;
        } else return true;
    }
    public  void giveMoney(int amount){
        int count = 0, count1 = 0, count2 = 0;
        while (amount > 0){
                if (amount % 100 == 0){
                    amount -= 100;
                    oneHundredNominal--;
                    count++;
                } else if (amount % 50 == 0){
                    amount -= 50;
                    fiftyNominal--;
                    count1++;
                } else if (amount % 20 == 0){
                    amount -= 20;
                    twentyNominal--;
                    count2++;
                } else{
                    amount -= 20;
                    twentyNominal--;
                    count2++;
                }
        }
        System.out.println("Bills in denominations of 100: " + count +
                            "\nBills in denominations of 50: " + count1 +
                            "\nBills in denominations of 20: " + count2);
    }
}
