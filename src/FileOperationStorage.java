import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperationStorage implements OperationStorage{
    private File file = new File("src/DocFile/History.txt");
    @Override
    public void save(Operation operation) {
        try(FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(operation.toNewStringStorage());
            fileWriter.write(10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Operation> findAll() {
        List<Operation> operations = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                Operation operation = stringToOperation(scanner.nextLine());
                operations.add(operation);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return operations;
    }
    private Operation stringToOperation(String operation) {
        String[] operands = operation.split(" ");

        double operand1;
        double operand2;
        double operand3;

        try {
            operand1 = Double.parseDouble(operands[0]);
            operand2 = Double.parseDouble(operands[1]);
            operand3 = Double.parseDouble(operands[3]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        return new Operation(
                operand1,
                operand2,
                operand3,
                operands[2]
        );
    }

}
