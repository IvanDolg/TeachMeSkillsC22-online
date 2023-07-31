import java.util.Scanner;

public class ConsoleReader implements Reader{
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public double readNumber() {
        return scanner.nextDouble();
    }

    @Override
    public String redType() {
        return scanner.next();
    }
}
