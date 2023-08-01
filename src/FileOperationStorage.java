import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationStorage implements OperationStorage{
    private String path = "history.txt";
    private File file = new File(path);

    @Override
    public void save(Operation operation) {
        try(FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("result: " + operation.getNum1() + " " + operation.getNum2() + " " + operation.getResult());
            fileWriter.write(10);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Operation> findAll() {
        List<Operation> operations = new ArrayList<>();
        try (FileReader reader = new FileReader(path)){
            BufferedReader reader1 = new BufferedReader(reader);
            String oper = reader1.readLine();
            while (oper != null){
                String[] operArr = oper.split(" ");
                Operation op = new Operation(Double.parseDouble(operArr[0]), Double.parseDouble(operArr[1]), operArr[2]);
                operations.add(op);
                oper = reader1.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return operations;
    }
}
