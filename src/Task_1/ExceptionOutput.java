package Task_1;

import Task_1.Execeptions.CheckingForCounsistency1;
import Task_1.Execeptions.CheckingForCounsistency2;
import Task_1.Execeptions.CheckingForCounsistency3;

public class ExceptionOutput {
    public static void checkForTheContrnts(String str, String sequence) throws CheckingForCounsistency1 {
        if (str.toLowerCase().contains(sequence.toLowerCase())){
            System.out.println("Contains sequence is: " + sequence);
        } else {
            throw new CheckingForCounsistency1("This number dont have this sequence: " + sequence);
        }
    }
    public static void checkingForSequenceOfNumbers(String str, String prefix) throws CheckingForCounsistency2 {
        if (str.startsWith(prefix)){
            System.out.println("Start with '555': " + str.startsWith(prefix));
        } else {
            throw new CheckingForCounsistency2("Dont start with: " + prefix);
        }
    }
    public static void checkingForTheEndOfSequence(String str, String prefix) throws CheckingForCounsistency3{
        if (str.endsWith(prefix)){
            System.out.println("End with '1a2b': " + str.endsWith(prefix));
        } else {
            throw  new CheckingForCounsistency3("Dont end with: " + prefix);
        }
    }
}
