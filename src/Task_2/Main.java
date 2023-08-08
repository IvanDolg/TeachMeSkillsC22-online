package Task_2;

public class Main {
    public static void main(String[] args) {
        ValidCheck validCheck = new ValidCheck();
        validCheck.validDocFileCheck();

        System.out.println("\nMap output: ");
        validCheck.showValidDoc();
    }
}
