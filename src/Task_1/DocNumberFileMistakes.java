package Task_1;

import Task_1.Exception.BeginningOfTheLine;
import Task_1.Exception.DocNumException;

public class DocNumberFileMistakes {

    public static boolean validationCheck(String str) throws BeginningOfTheLine {
        if (str.startsWith("docnum") || str.startsWith("contract")){
            return true;
        }
        else return false;
    }

    public static boolean CheckingForTheNumberOfLetters (String str) throws DocNumException {
        if (str.length() == 15) {
            return  true;
        }
        else return false;
    }
}
