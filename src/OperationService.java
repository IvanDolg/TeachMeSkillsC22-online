import java.util.ArrayList;
import java.util.List;

public class OperationService {
    private final OperationStorage storage = new FileOperationStorage();

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

    public List<String> getHistory(){
        List<Operation> all = storage.findAll();
        List<String> result = new ArrayList<>();
        for (Operation operation : all){
            result.add(operation.toString());
        }
        return result;
    }
}
