package druid;

import JDBC快速入门.User;
import utils.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: zcl
 * @create: 2022/1/14 13:18
 * 配置文件
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
//        //创建连接池对象
//        Properties properties = new Properties();
//        //加载配置文件
//        InputStream is = Demo2.class.getClassLoader().getResourceAsStream("druid.properties");
//        properties.load(is);
//        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //根据连接池获取连接
        Connection connection = DruidUtils.getConnection();
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
        DruidUtils.release(resultSet, preparedStatement, connection);

    }
}

