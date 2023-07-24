package Task_1.Exception;

public class BeginningOfTheLine extends Exception{
    public BeginningOfTheLine(String str){
        super(str);
        System.out.println("Document number is not valid.");
    }
}