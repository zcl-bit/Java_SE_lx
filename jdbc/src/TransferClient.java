import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: zcl
 * @create: 2022/1/14 8:41
 */
public class TransferClient {
    public static void main(String[] args) throws Exception {
        //需求：张三给李四转100，使用事务进行控制
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
//            1. 注册驱动
            connection = JDBCUtils.getConnection();
//            2. 手动开启事务
            connection.setAutoCommit(false);
//            3. 创建预编译sql语句对象
            String sql1 = "update account set money = money - ? where name = ?";
            String sql2 = "update account set money = money + ? where name = ?";
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement2 = connection.prepareStatement(sql2);
//            4. 设置参数
//            5. 执行sql语句
            //zs-100
            preparedStatement1.setDouble(1, 100);
            preparedStatement1.setString(2, "zs");
            int rows1 = preparedStatement1.executeUpdate();
            //可能出现异常
//            System.out.println(1/0);
            //ls+100
            preparedStatement2.setDouble(1, 100);
            preparedStatement2.setString(2, "ls");
            int rows2 = preparedStatement2.executeUpdate();

            //6、提交事务
            connection.commit();



        } catch (Exception e) {
            try{
                connection.rollback();
            }catch (SQLException e1){
                e1.printStackTrace();
            }

        }finally {
            //7、释放资源
            JDBCUtils.release(null, preparedStatement1, connection);
            JDBCUtils.release(null, preparedStatement2, connection);
        }
    }
}
