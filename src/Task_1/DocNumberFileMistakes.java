package Task_1;

import Task_1.Exception.BeginningOfTheLine;
import Task_1.Exception.DocNumException;

public class DocNumberFileMistakes {

    public static boolean validationCheck(String str) throws BeginningOfTheLine {
        if (str.startsWith("docnum") || str.startsWith("contract")){
            return true;
        }
        else throw new BeginningOfTheLine("Each line should start with 'docnum' && 'contract'");
    }

    public static boolean CheckingForTheNumberOfLetters (String str) throws DocNumException {
        if (str.length() == 15) {
            return  true;
        }
        else throw new DocNumException("The length of each line is only 15 characters");
    }
}
