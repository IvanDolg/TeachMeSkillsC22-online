package Task_1;

public class DocNumberFileMistakes {

    public static boolean validationCheck(String str)  {
        if (str.startsWith("docnum") || str.startsWith("contract")){
            return true;
        }
        else return false;
    }

    public static boolean CheckingForTheNumberOfLetters (String str) {
        if (str.length() == 15) {
            return  true;
        }
        else return false;
    }
}
