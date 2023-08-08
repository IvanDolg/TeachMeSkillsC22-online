package Task_1;

/*      Написать программу для проверки на валидность введенного ip адреса.
        Пусть ip адрес задается с консоли.
        Программа должна проверять валидность введенного ip адреса с
        помощью регулярного выражения и выводить результат проверки на
        экран.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id address: " );
        String ipAddress = scanner.nextLine();


        String regexp = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(ipAddress);

       if (matcher.find()){
           System.out.println("Ip address valid");
       } else System.out.println("Ip address does not fit the condition");
    }
}
