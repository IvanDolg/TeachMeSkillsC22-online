package Task_2.Exception;

public class IncorrectLoginException extends Exception{
    public IncorrectLoginException(String login){
        super(login);
        System.out.println(login);
    }
}
