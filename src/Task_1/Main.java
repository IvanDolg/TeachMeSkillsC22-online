package Task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id address: " );
        String ipAddress = scanner.nextLine();

        String regexp = "^(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})(?:\\.(?:25[0-5]|2[0-4]\\d|[0-1]?\\d{1,2})){3}$";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ipAddress);

       if (matcher.matches()){
           System.out.println("Ip address valid");
       } else System.out.println("Ip address is invalid");
    }
}
