package mate.hw13.sql;

import com.mysql.cj.jdbc.JdbcConnection;
import util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsoleApplication {

    public static void main(String[] args) {
        CrudOperations operations = new CrudOperations();
        operations.deleteOperation();
        operations.createOperation();
        operations.readOperation();
        operations.updateOperation();
    }
}
