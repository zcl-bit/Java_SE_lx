package demo;

import JDBC快速入门.User;
import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/1/14 7:45
 */
public class Demo {
    @Test
    //往test数据库中的user表中插入一条记录
    public void insert() throws Exception {
        //1、加载驱动，获得连接
        Connection connection = JDBCUtils.getConnection();
        //2、创建预编译sql语句对象
        String sql = "insert into user values (null,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3、设置参数
        preparedStatement.setString(1,"tq");
        preparedStatement.setString(2,"123456");
        preparedStatement.setString(3,"田七");
        //4、执行sql语句
        int rows = preparedStatement.executeUpdate();
        System.out.println("受影响的行数"+ rows);

        //5、释放资源
        JDBCUtils.release(null,preparedStatement,connection);
    }


    @Test
    //删除test数据库中的user表中的记录
    public void delete() throws Exception {
        //1、加载驱动，获得连接
        Connection connection = JDBCUtils.getConnection();
        //2、创建预编译sql语句对象
        String sql = "delete from user where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3、设置参数
        preparedStatement.setInt(1,5);
        //4、执行sql语句
        int rows = preparedStatement.executeUpdate();
        System.out.println("受影响的行数"+ rows);

        //5、释放资源
        JDBCUtils.release(null,preparedStatement,connection);
    }


    @Test
    //查看test数据库中的user表中的所有记录
    public void select() throws Exception {
        //1、加载驱动，获得连接
        Connection connection = JDBCUtils.getConnection();
        //2、创建预编译sql语句对象
        String sql = "select * from user";
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
        JDBCUtils.release(resultSet,preparedStatement,connection);
        for (User user:arrayList
             ) {
            System.out.println(user);

        }

    }

    @Test
    //查看test数据库中的user表中的符合条件记录
    public void select2() throws Exception {
        //1、加载驱动，获得连接
        Connection connection = JDBCUtils.getConnection();
        //2、创建预编译sql语句对象
        String sql = "select * from user where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3、设置参数
        preparedStatement.setString(1,"zs");
        //4、执行sql语句
        ResultSet resultSet = preparedStatement.executeQuery();

        User use = null;
//        //创建ArrayList集合，限制集合元素类型为user
//        ArrayList<User> arrayList = new ArrayList<User>();
        while (resultSet.next()) {
            //创建user对象
            use = new User();
            //给属性赋值
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getString("username"));
            use.setPassword(resultSet.getString("password"));
//            user.setNickname(resultSet.getString("nickname"));
//            //添加到集合中
//            arrayList.add(user);
        }

        //5、释放资源
        JDBCUtils.release(resultSet,preparedStatement,connection);
//        for (User user:arrayList
//        ) {
//            System.out.println(user);
//
//        }
        System.out.println(use);
    }
}
