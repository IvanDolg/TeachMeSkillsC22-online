import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperationStorage implements OperationStorage{
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    @Override
    public void save(Operation operation) {
        try (Connection connection1 = DriverManager.getConnection(url, "postgres", "111111");
             PreparedStatement preparedStatement = connection1.prepareStatement("insert into \"user\" values (?, ?, ?, ?)")){

            preparedStatement.setDouble(1, operation.getNum1());
            preparedStatement.setDouble(2, operation.getNum2());
            preparedStatement.setString(3, operation.getType());
            preparedStatement.setDouble(4, operation.getResult());

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Operation> findAll() {
        List<Operation> allOperations = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url,"postgres", "111111");
            PreparedStatement statement = connection.prepareStatement("select * from \"user\"")){

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                double num1 = resultSet.getDouble(1);
                double num2 = resultSet.getDouble(2);
                String type = resultSet.getString(3);
                double result = resultSet.getDouble(4);

                Operation operation = new Operation(num1, num2, result, type);
                allOperations.add(operation);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allOperations;
    }
}
