package Task_1.Execeptions;

public class CheckingForCounsistency2 extends Exception {
    public CheckingForCounsistency2(String msg){
        super(msg);
        System.out.println(msg);
    }
}
