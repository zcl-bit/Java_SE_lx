import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: zcl
 * @create: 2022/1/13 14:21
 */
public class DrivermanagerTest {
    /**
     * Drivermanager类
     * public class Driver extends NonRegisteringDriver implements java.sql.Driver {
     *     public Driver() throws SQLException {
     *     }
     *
     *     static {
     *         try {
     *             DriverManager.registerDriver(new Driver());
     *         } catch (SQLException var1) {
     *             throw new RuntimeException("Can't register driver!");
     *         }
     *     }
     * }
     *
     * */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        DriverManager.registerDriver(new Driver());

        Class.forName("com.mysql.jdbc.Driver");
    }
}
