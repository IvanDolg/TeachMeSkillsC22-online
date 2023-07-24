package Task_1;

import Task_1.Exception.BeginningOfTheLine;
import Task_1.Exception.CounterException;
import Task_1.Exception.DocNumException;

public class DocNumberFileMistakes {

    public static boolean NumberCheck(int counter) throws CounterException {
        if (counter < 1 || counter > 6){
            throw new CounterException("The number must be no more than 6 && no less than 1");
        } else return true;
    }
    public static boolean checkValid(String str) throws BeginningOfTheLine {
        if (str.startsWith("docnum") || str.startsWith("contract")){
            return true;
        }
        else throw new BeginningOfTheLine("Each line should start with 'docnum' && 'contract'");
    }
    public static boolean numberCheck (String str) throws DocNumException {
        if (str.length() == 15) {
            return  true;
        }
        else throw new DocNumException("The length of each line is only 15 characters");
    }
}
