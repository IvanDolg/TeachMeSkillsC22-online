package Task_1;

import Task_1.Exception.CounterException;

public class DocNumberFileMistakes {

    public static boolean NumberCheck(int counter) throws CounterException {
        if (counter < 1 || counter > 4){
            throw new CounterException("The number must be no more than 4 && no less than 1");
        } else return true;
    }
}
