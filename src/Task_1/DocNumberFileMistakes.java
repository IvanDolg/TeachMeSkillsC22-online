package Task_1;

import Task_1.Exception.CounterException;

public class DocNumberFileMistakes {

    public static boolean NumberCheck(int counter) throws CounterException {
        if (counter < 1 || counter > 6){
            throw new CounterException("The number must be no more than 6 && no less than 1");
        } else return true;
    }
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
