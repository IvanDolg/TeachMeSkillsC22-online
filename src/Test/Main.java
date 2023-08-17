package Test;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        JdbcSample jdbcSample = new JdbcSample();
        try {
            jdbcSample.save("Test7", 80);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
