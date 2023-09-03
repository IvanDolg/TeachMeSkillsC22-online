import java.util.ArrayList;
import java.util.List;

public class OperationService {
    private final Reader reader = new ConsoleReader();
    private final Writer writer = new ConsoleWriter();
    private final OperationStorage storage = new DatabaseOperationStorage();
    public Operation calculate(Operation operation){
        switch (operation.getType()){
            case "sum":
                operation.setResult(operation.num1 + operation.num2);
                storage.save(operation);
                return operation;
            case "sub":
                operation.setResult(operation.num1 - operation.num2);
                storage.save(operation);
                return operation;
            case "mul":
                operation.setResult(operation.num1 * operation.num2);
                storage.save(operation);
                return operation;
            case "div":
                operation.setResult(operation.num1 / operation.num2);
                storage.save(operation);
                return operation;
        }
            throw new RuntimeException();
    }

    public void newOperation(){
        writer.write("Enter number 1: ");
        double num1 = reader.readNumber();
        writer.write("Enter number 2: ");
        double num2 = reader.readNumber();
        writer.write("Choose type: sum, sub, mul, div: ");
        String type = reader.redType();
        Operation operation = new Operation(num1, num2, type);
        Operation result = calculate(operation);
        writer.write("Result: " + result.getResult());
    }

    public List<String> getHistory(){
        List<Operation> all = storage.findAll();
        List<String> result = new ArrayList<>();
        for (Operation operation : all){
            result.add(operation.toString());
        }
        return result;
    }
}
