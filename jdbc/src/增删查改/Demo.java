package 增删查改;

import JDBC快速入门.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/1/13 15:16
 *
 */
public class Demo {
    @Test
    //添加记录
    public void insert() throws Exception {
        //1、加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        int rows = statement.executeUpdate("insert into user values (null,'zl',13456,'赵六')");
        System.out.println("受影响的行数:"+rows);
        //5、释放资源
        if (statement != null) {

            statement.close();
        }
        if (statement != null) {

            connection.close();
        }
    }
    @Test
    //修改记录
    public void update() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        String sql = "update user set password = '123456' where username='wangwu'";
        int rows = statement.executeUpdate(sql);
        System.out.println("受影响的行数:"+rows);
        //5、释放资源
        if (statement != null) {

            statement.close();
        }
        if (statement != null) {

            connection.close();
        }

    }
    @Test
    //删除记录
    public void delete() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        String sql = "delete from user where id =3";
        int rows = statement.executeUpdate(sql);
        System.out.println("受影响的行数:"+rows);
        //5、释放资源
        if (statement != null) {

            statement.close();
        }
        if (statement != null) {

            connection.close();
        }

    }
    @Test
    //查看所有记录
    public void select() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
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
        if (resultSet != null){
            resultSet.close();
        }
        if (statement != null) {

            statement.close();
        }
        if (statement != null) {

            connection.close();
        }
        System.out.println(arrayList);

    }
    @Test
    //查看满足条件数据
    public void select2() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //4、执行sql语句，处理结果
        String sql = "select * from user where id=4";
        ResultSet resultSet = statement.executeQuery(sql);
        //只有当对象有值时才会进行创建user对象，节约内存
        User use = null;
        while (resultSet.next()) {
            //创建一个User对象，用来封装记录的数据
            use = new User();
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getString("username"));
            use.setUsername(resultSet.getString("password"));
            use.setUsername(resultSet.getString("nickname"));

        }
        //5、释放资源
        if (resultSet != null){
            resultSet.close();
        }
        if (statement != null) {

            statement.close();
        }
        if (statement != null) {

            connection.close();
        }

        if (use == null){
            System.out.println("失败");
        }else{
            System.out.println("成功");
        }


    }
    @Test
    public void show(){

    }


}
