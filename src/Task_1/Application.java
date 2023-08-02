package Task_1;

import java.util.Scanner;

public class Application extends ApplicationMethod{
    Scanner scanner = new Scanner(System.in);
    public void start(){
        while (true){
            System.out.print("\n1) - Remove duplicates" +
                    "\n2) - Output all even elements in the range from 7 to 17 (inclusive)" +
                    "\n3) - Multiply each element by 2" +
                    "\n4) - Sort and display the first 4 elements " +
                    "\n5) - Print the number of elements in the incentive" +
                    "\n6) - Output the arithmetic mean of all the numbers in the stream" +
                    "\n7) - Break\n" +
                    "\nEnter: ");

            int counter = scanner.nextInt();

            switch (counter){
                case 1 -> removeDuplicates();
                case 2 -> getAllEvenElements();
                case 3 -> multiplyElements();
                case 4 -> sort();
                case 5 -> getAmountOfElements();
                case 6 -> getArithmeticMean();
                case 7 -> {
                    return;
                }
                default -> throw new RuntimeException();
            }
        }
    }
}
