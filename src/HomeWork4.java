import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        System.out.println(getSeson(5));
        System.out.println(getSeson1(3));
        System.out.println(getParity(10));
        getWeather(-20);
        System.out.println(getNameColour(4));
        getNumber();
        getNumberInc();
        getSum();
        getSequence();
        getSequenceNew();
        getSquaresNum();
        getFibonacciNum();
        giveMoneyToBank();
        getTable();
    }

    // 1 task
    // The names of the time of the year by the number of the month (use: switch/case).
    public static String getSeson(int month){
        switch (month){
            case 1, 2, 12:
                return "This is a Winter \n";
            case 3, 4, 5:
                return "This is a Spring \n";
            case 6, 7, 8:
                return "This is a Summer \n";
            case 9, 10, 11:
                return "This is a Autumn \n";
            default:
                return "There is no such month in the year \n";
        }
    }

    // 2 task
    // The names of the time of the year by the number of the month (use: if-else-if).
    public static String getSeson1(int month){
        if (month == 1 || month == 2 || month == 12){
            return "This is a Winter \n";
        } else if (month == 3 || month == 4 || month == 5) {
            return "This is a Spring \n";
        } else if (month == 6 || month == 7 || month == 8) {
            return "This is a Summer \n";
        } else if (month == 9 || month == 10 || month == 11) {
            return "This is a Autumn \n";
        } else {
            return "There is no such month in the year \n";
        }
    }

    // 3 task
    // Parity / odd numbers.
    public static String getParity (int number){
        if (number%2 == 0){
            return "Yor number is even: " + number + "\n";
        } else {return "Yor number is odd: " + number + "\n";}
    }

    // 4 task
    // Weather interval (Heat/Normally/Cold).
    public static void getWeather (int tem){
        String status = (tem > -5) ? "Heat \n" : (tem > -20 && tem <= -5) ? "Normally \n" : "Cold \n";
        System.out.println(status);
    }

    // 5 task
    // Each number must match the color of the rainbow.
    public static String getNameColour (int colourNum){
        switch (colourNum){
            case 1:
                return "Red \n";
            case 2:
                return "Orange \n";
            case 3:
                return "Yellow \n";
            case 4:
                return "Green \n";
            case 5:
                return "Blue \n";
            case 6:
                return "Dark blue \n";
            case 7:
                return "Violet \n";
            default:
                return "Wrong number \n";
        }
    }
    // ---- Cycles ----
    // 1 task
    // Print numbers from 1 to 99 (use: for()).

    int counter = 1;
    public static void getNumber(){
        for(int i = 1, a = 1; i <= 99; i+=2){
            System.out.println(a + ") "+ i);
                a++;
        }
        System.out.println();
    }

    // 2 task
    // Print numbers from 5 to 1
    public static void getNumberInc(){
        for (int i = 5; i > 1; i--){
            System.out.println(i);
        }
    }

    // 3 task
    // The user enters any positive int. And the program sums up all
    // the numbers from 1 to the number entered by the user
    // (use: the Scanner class).
    public static void getSum(){
        System.out.print("\nPrint number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        System.out.println("Number: " + number);

        for (int i = 1; i < number; i++){
           sum = sum + i;
        }
        System.out.println("Sum of numbers: " + sum);
    }

    // 4 task
    // Output the sequence 7 14 21 28 35 42 49 56 63 70 77 84 91 98
    // (use: cycle while).
    public static void getSequence(){
        int number = 0;

        while (number < 98){
            System.out.print("\nNumber: " + (number+=7));
        }
    }

    // 5 task
    // Print the first 10 numbers of the sequence
    public static void getSequenceNew(){
        System.out.print("\n\nOur sequence: ");
        for (int i = 0; i >= -45; i+= -5){
            System.out.print(i + " ");
        }
    }

    // 6 task
    // Print squares of numbers from 10 to 20 inclusive.
    public static void getSquaresNum() {
        System.out.println("\n\nSquares are equal: ");

        for (int i = 10; i <= 20; i++){
            System.out.println(Math.pow(i,2));
        }
    }

    // ---- Additionaly ----
    // 1 task
    // Display the first 11 members of the Fibonacci sequence.
    public static void getFibonacciNum(){
        int n = 1;
        int n1 = 1;
        int n2;
        System.out.print("\n"+n + " " + n1 + " ");
        for(int i = 3; i<=11; i++){
            n2= n+n1;
            System.out.print(n2 + " ");
            n=n1;
            n1=n2;
        }
    }

    // 2 task
    // Enter the deposit amount and the number of months.
    // The bank calculates the final amount of the deposit taking into account
    // taking into account the interest accrued for each month.
    // (use: for && float)
    public static void giveMoneyToBank(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter the amount of money: ");
        float money =  scanner.nextFloat();

        System.out.print("Enter the amount of month ");
        int month = scanner.nextInt();

        for(int i = 1; i <= month; i++){
            money += money * 0.07;
        }
        System.out.println("After " + month + " months the deposit amount will be: " + money + "\n");
    }

    // 3 task
    // Multiplication table
    public static void getTable(){
        System.out.println("Multiplication table: ");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
