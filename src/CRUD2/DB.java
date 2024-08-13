package CRUD2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection connect() throws SQLException {

        try {
            var jdbcURL = DatabaseConfig.getDbUrl();
            var jdbcUser = DatabaseConfig.getDbUser();
            var jdbcPassword = DatabaseConfig.getDbPassword();

            return DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }


}
