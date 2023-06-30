package Task_1;

import Task_1.Execeptions.CheckingForCounsistency1;
import Task_1.Execeptions.CheckingForCounsistency2;
import Task_1.Execeptions.CheckingForCounsistency3;

public class Main {
    public static void main(String[] args) {

        String str = "555-erf-5678-abc-1a2b";

/*      Checking for the content of the abc sequence.  */
        try {
            ExceptionOutput.checkForTheContrnts(str, "abc");
        } catch (CheckingForCounsistency1 ex) {
            throw new RuntimeException(ex);
        }

/*      Checking for the presence of the sequence 555 at the beginning of the document number. */
        try {
            ExceptionOutput.checkingForSequenceOfNumbers(str, "555");
        } catch (CheckingForCounsistency2 e) {
            throw new RuntimeException(e);
        }

/*      Checking for the presence of the sequence 1a2b at the end of the document number. */
        try {
            ExceptionOutput.checkingForTheEndOfSequence(str, "1a2b");
        } catch (CheckingForCounsistency3 e) {
            throw new RuntimeException(e);
        }
    }
}
