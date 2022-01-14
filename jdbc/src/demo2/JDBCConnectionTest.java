package demo2;

import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author: zcl
 * @create: 2022/1/14 8:25
 */
public class JDBCConnectionTest {
    public static void main(String[] args) throws Exception {
        /**
         * Connection接口的api
         * setAutoCommit(boolean
         * autoCommit)
         * 参数是true或false 如果设置为false，表示关闭自动提交，相当于开启事务; 类似sql里面的 start transaction;
         * void commit() 提交事务; 类似sql里面的 commit;
         * void rollback() 回滚事务; 类似sql里面的 rollback;
         * */
        //练习：模拟zs账户-100的操作
        //1、注册驱动，获得连接
        Connection connection = JDBCUtils.getConnection();
        //2、手动开启事务
        connection.setAutoCommit(false);
        //3、创建预编译sql语句对象
        String sql = "update account set money = money - ? where name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4、设置参数
        preparedStatement.setDouble(1,100);
        preparedStatement.setString(2,"zs");
        //5、执行sql语句，处理结果
        int rows = preparedStatement.executeUpdate();
        System.out.println("受影响的行数："+rows);
        //6、提交事务
        connection.commit();
        //7、释放资源
        JDBCUtils.release(null,preparedStatement,connection);
    }
}
