import JDBC快速入门.User;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/1/13 16:44
 */
public class LoginTest {
    public static void main(String[] args) throws Exception {
        /**
         * 在控制台输入用户名和密码，查询数据库，如果数据库存在当前用户，显示登陆成功！
         * 如果数据库不存在当前用户，显示登陆失败
         * */
        //1、获取用户输入的用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //2、根据用户输入的用户名和密码去数据库中查询记录（封装）
        Connection connection = JDBCUtils.getConnection();
        //2.3、创建执行sql语句对象
        Statement statement = connection.createStatement();
        //2.4、执行sql语句，处理结果
        String sql = "select * from user where username =" + "'"+ username + "'" + "and password = " + "'" + password + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        User user = null;
        while (resultSet.next()) {
            //创建user对象
            user = new User();
            //给属性赋值
            user.setId(resultSet.getInt("id"));
            user.setUsername(resultSet.getString("username"));
            user.setUsername(resultSet.getString("password"));
            user.setUsername(resultSet.getString("nickname"));
        }
        //2.5、释放资源
        JDBCUtils.release(resultSet,statement,connection);
        //3、判断是否查询到数据
        if (user != null){
            // 3.1如果查询到了，显示登陆成功(判断user是否为null)
            System.out.println("登陆成功");
        }else {
            // 3.2如果没有查询到，就显示登陆失败!
            System.out.println("登陆失败");
        }


    }
}
