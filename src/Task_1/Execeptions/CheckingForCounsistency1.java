package Task_1.Execeptions;

public class CheckingForCounsistency1 extends Exception {
    public CheckingForCounsistency1(String msg){
        super(msg);
        System.out.println(msg);
    }
}
