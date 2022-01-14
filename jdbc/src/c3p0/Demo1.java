package c3p0;

import JDBC快速入门.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: zcl
 * @create: 2022/1/14 11:25
 * 硬编码
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //创建连接池对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        dataSource.setInitialPoolSize(5);
        //根据连接池获取连接
        Connection connection = dataSource.getConnection();
        //创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置参数
        preparedStatement.setInt(1,1);

        //执行sql语句，处理结果
        ResultSet resultSet = preparedStatement.executeQuery();
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
        }
        System.out.println(user);
        //释放资源
        JDBCUtils.release(resultSet,preparedStatement,connection);

    }
}
