package druid;

import JDBC快速入门.User;
import com.alibaba.druid.pool.DruidDataSource;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: zcl
 * @create: 2022/1/14 13:17
 * 硬编码
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //创建连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setInitialSize(5);
        //根据连接池获取连接
        Connection connection = dataSource.getConnection();
        //创建预编译sql语句对象
        String sql = "select * from user where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置参数
        preparedStatement.setInt(1, 1);

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
        JDBCUtils.release(resultSet, preparedStatement, connection);

    }
}