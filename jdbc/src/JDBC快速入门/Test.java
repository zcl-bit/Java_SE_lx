package JDBC快速入门;



import java.sql.*;
import java.util.ArrayList;

/**
 * @author: zcl
 * @create: 2022/1/13 13:41
 */
public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //1、创建Java项目，导入mysql驱动jar包
        //2、加载驱动
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3、获得连接
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, user, password);
        //4、获得执行sql语句对象
        Statement statement = connection.createStatement();
        //5、执行sql语句，处理结果
        ResultSet resultSet = statement.executeQuery("select * from user");
        //创建一个ArrayList集合，限制集合中的元素类型为user
        ArrayList<User> arrayList = new ArrayList<>();
        while (resultSet.next()) {
//            System.out.println(resultSet.getObject("id"));
//            System.out.println(resultSet.getObject("username"));
//            System.out.println(resultSet.getObject("password"));
//            System.out.println(resultSet.getObject("nickname"));
//            System.out.println("====================");
//            System.out.println(resultSet.getObject(1));
//            System.out.println(resultSet.getObject(2));
//            System.out.println(resultSet.getObject(3));
//            System.out.println(resultSet.getObject(4 ));
            //创建User对象，并封装遍历出来的这条记录每列的数据
            User use = new User();
            use.setId(resultSet.getInt("id"));
            use.setUsername(resultSet.getNString("username"));
            use.setUsername(resultSet.getNString("password"));
            use.setUsername(resultSet.getNString("nickname"));
            arrayList.add(use);
        }

        //6、释放资源
        if (resultSet != null) {

            resultSet.close();
        }
        if (resultSet != null) {

            statement.close();
        }
        if (resultSet != null) {

            connection.close();
        }
        System.out.println(arrayList);
    }
}
