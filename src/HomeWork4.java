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
    public static void getNumber(){
        for(int i = 1; i <= 99; i+=2){
                System.out.println(i);
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
}
