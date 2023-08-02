package Task_2;

import java.util.Scanner;

public class Application1 extends ApplicationMethod{
    Scanner scanner = new Scanner(System.in);
    public void start (){
        while (true){
            System.out.print("\n1) - Return the number of the number of people with your name (regardless of uppercase/lowercase letters)" +
                    "\n2) - Select all names starting with 'a' regardless of uppercase lowercase letters " +
                    "\n3) - Sort and return the first element of the collection or Empty if the collection is empty" +
                    "\n4) - Break\n" +
                    "\nEnter: ");

            int counter = scanner.nextInt();

            switch (counter){
                case 1 -> getNumberOfMatches();
                case 2 -> getNamesByCondition();
                case 3 -> sort();
                case 4 -> {return;}
                default -> throw new RuntimeException();
            }
        }
    }
}
