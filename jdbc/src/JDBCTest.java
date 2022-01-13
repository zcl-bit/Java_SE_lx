import JDBC快速入门.User;
import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/1/13 16:00
 */
public class JDBCTest {
//    public static void main(String[] args) throws Exception {

    @Test
    //添加记录
    public void insert() throws Exception {
        Connection connection = JDBCUtils.getConnection();
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        int rows = statement.executeUpdate("insert into user values (null,'zl',13456,'赵六')");
        System.out.println("受影响的行数:" + rows);
        //5、释放资源
        JDBCUtils.release(null, statement, connection);
    }


    //    }
    //查看所有记录
    public void select() throws Exception {

        Connection connection = JDBCUtils.getConnection();
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        //创建集合
        ArrayList<User> arrayList = new ArrayList<>();
        while (resultSet.next()) {
            //创建一个User对象，用来封装记录的数据
            User use = new User();
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getString("username"));
            use.setUsername(resultSet.getString("password"));
            use.setUsername(resultSet.getString("nickname"));
            arrayList.add(use);
        }
        //5、释放资源
        JDBCUtils.release(resultSet, statement, connection);
        System.out.println(arrayList);

    }

}
