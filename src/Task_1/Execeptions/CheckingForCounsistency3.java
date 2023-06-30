package Task_1.Execeptions;

public class CheckingForCounsistency3 extends Exception {
    public CheckingForCounsistency3(String msg){
        super(msg);
        System.out.println(msg);
    }
}
