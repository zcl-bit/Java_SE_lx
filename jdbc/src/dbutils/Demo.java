package dbutils;

import JDBC快速入门.User;
import org.junit.Test;
import utils.JDBCUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/1/14 9:34
 */
public class Demo {
//    @Test
//    //修改test数据库中的user表中的记录
//    public void update() throws Exception {
//        //1、创建连接池，获得连接
//        EasySource easySource = new EasySource();
//        System.out.println("获得连接之前："+EasySource.getCount());
//        Connection connection = easySource.getAbc();
//        System.out.println("获得连接之后："+EasySource.getCount());
//        //2、创建预编译sql语句对象
//        String sql = "update user set password =? where id = ?";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        //3、设置参数
//        preparedStatement.setString(1,"654321");
//        preparedStatement.setInt(2,7);
//        //4、执行sql语句
//        int rows = preparedStatement.executeUpdate();
//        System.out.println("受影响的行数"+ rows);
//
//        //归还连接
//        easySource.addBack(connection);
//
//        //5、释放资源
//        JDBCUtils.release(null,preparedStatement,connection);
//
//        System.out.println("归还连接之后："+EasySource.getCount());
//    }
//
//    @Test
//    //查看test数据库中的user表中的所有记录
//    public void select() throws Exception {
//        //1、加载驱动，获得连接
//        EasySource easySource = new EasySource();
//        System.out.println("获得连接之前的的数量" + EasySource.getCount());
//        Connection connection = easySource.getAbc();
//        System.out.println("获得连接之后的的数量" + EasySource.getCount());
//        //2、创建预编译sql语句对象
//        String sql = "select * from user";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        //3、设置参数
//
//        //4、执行sql语句
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        //创建ArrayList集合，限制集合元素类型为user
//        ArrayList<User> arrayList = new ArrayList<User>();
//        while (resultSet.next()) {
//            //创建user对象
//            User user = new User();
//            //给属性赋值
//            user.setId(resultSet.getInt("id"));
//            user.setUsername(resultSet.getString("username"));
//            user.setPassword(resultSet.getString("password"));
//            user.setNickname(resultSet.getString("nickname"));
//            //添加到集合中
//            arrayList.add(user);
//        }
//
//        //5、释放资源
//        easySource.addBack(connection);
//        JDBCUtils.release(resultSet,preparedStatement,connection);
//        for (User user:arrayList
//        ) {
//            System.out.println(user);
//
//        }
//        System.out.println("归还连接之后的数量"+ EasySource.getCount());
//
//    }


    @Test
    //查看test数据库中的user表中的所有记录
    public void select() throws Exception {
        //1、加载驱动，获得连接
        DataSource dataSource = new MiddleSource();
        System.out.println("获得连接之前的的数量" + MiddleSource.getCount());
        Connection connection = dataSource.getConnection();
        System.out.println("获得连接之后的的数量" + MiddleSource.getCount());
        //2、创建预编译sql语句对象
        String sql = "select * from user";
        //换成增强的连接
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3、设置参数

        //4、执行sql语句
        ResultSet resultSet = preparedStatement.executeQuery();

        //创建ArrayList集合，限制集合元素类型为user
        ArrayList<User> arrayList = new ArrayList<User>();
        while (resultSet.next()) {
            //创建user对象
            User user = new User();
            //给属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
            user.setNickname(resultSet.getString("nickname"));
            //添加到集合中
            arrayList.add(user);
        }

        //5、释放资源
//        ((MiddleSource)dataSource).addBack(connection);
        JDBCUtils.release(resultSet,preparedStatement,connection);
        for (User user:arrayList
        ) {
            System.out.println(user);

        }
        System.out.println("归还连接之后的数量"+ MiddleSource.getCount());

    }
}
