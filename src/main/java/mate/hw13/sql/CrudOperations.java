package mate.hw13.sql;

import util.JdbcConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperations {

    public static void createOperation() {
        Statement statement = JdbcConnectionUtil.getConnection();
        String query = "insert into developers(name, age, sex, salary) values ('anja', 21, 'female', 20)";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readOperation(){
        Statement statement = JdbcConnectionUtil.getConnection();
        String query = "select * from projects";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateOperation(){
        Statement statement = JdbcConnectionUtil.getConnection();
        String query = "update developers set salary = 40 where name = 'anja'";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteOperation(){
        Statement statement = JdbcConnectionUtil.getConnection();
        String query = "delete from developers where name = 'anja'";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
