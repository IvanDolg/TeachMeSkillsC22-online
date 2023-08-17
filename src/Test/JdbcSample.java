package Test;

import java.sql.*;

public class JdbcSample {
    public void save(String name, int age) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "111111");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into \"user\" values (?, ?)");
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.execute();
        // Statement statement = connection.createStatement();
       // statement.execute("insert into \"user\" values ('Test99', 99)");
        preparedStatement.close();
    }
}
