package nuc.sw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author superzhaolu
 * @date 2017/11/21
 */
public class JDBCUtil {
    private static String DBUsername="root";
    private static String DBPassword="lilu19970327";
    private static String DBUrl="jdbc:mysql://localhost:3306/bighomework";
    private static String DBDriver="com.mysql.jdbc.Driver";
    private static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName(DBDriver);
            connection= DriverManager.getConnection(DBUrl, DBUsername, DBPassword);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
