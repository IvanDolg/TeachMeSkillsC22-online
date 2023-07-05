package Task_2;

import Task_1.Exception.BeginningOfTheLine;
import Task_1.Exception.DocNumException;

public class DocNumberFileMistakes {

    public static boolean checkValid(String str) {
        if (str.startsWith("docnum") || str.startsWith("contract")){
            return true;
        }
        else return false;
    }

    public static boolean numberCheck(String str) {
        if (str.length() == 15) {
            return  true;
        }
        else return false;
    }
}
