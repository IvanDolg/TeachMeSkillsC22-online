import java.util.List;

public class Application {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final OperationService operationService = new OperationService();

    public void start(){
        while (true){
            writer.write("Enter number 1: ");
            double num1 = reader.readNumber();
            writer.write("Enter number 2: ");
            double num2 = reader.readNumber();
            writer.write("Choose type: sum, sub, mul, div: ");
            String type = reader.redType();
            Operation operation = new Operation(num1, num2, type);
            Operation result = operationService.calculate(operation);
            writer.write("Result: " + result.getResult());


            writer.write("\nResume? \n1 - Yes, \n2 - No, \n3 - show history\nYour choice: ");
            double answer = reader.readNumber();
            if (answer == 2){
                break;
            }
            if (answer == 3){
                List<String> history = operationService.getHistory();
                for (String operationHistory : history){
                    writer.write(operationHistory);
                }
                break;
            }
        }
    }
}
