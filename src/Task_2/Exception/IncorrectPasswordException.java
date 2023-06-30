package Task_2.Exception;

public class IncorrectPasswordException extends Exception{
    public IncorrectPasswordException(String password){
        super(password);
        System.out.println(password);
    }
}
