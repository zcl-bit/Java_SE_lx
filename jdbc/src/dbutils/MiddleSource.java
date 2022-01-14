package dbutils;

import utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * @author: zcl
 * @create: 2022/1/14 10:02
 */
public class MiddleSource implements DataSource {
    /**
     * 1、定义一个LinkedList集合，用来存储初始化连接
     * */
    private static LinkedList<Connection> pools = new LinkedList<>();
    static {
        //创建一批连接，存储在连接池中
        for (int i = 0; i < 5; i++) {
            try {
                //获得连接
                Connection connection = JDBCUtils.getConnection();
                //添加到集合中
                pools.add(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//    /**
//     * 获取连接的方法
//     * @return 连接的对象
//     */
//    public Connection getAbc(){
//        Connection connection = pools.removeFirst();
//        return connection;
//    }

    /**
     * 归还连接的方法
     * @return connection
     */
    public void addBack(Connection connection){
        pools.addLast(connection);
    }

    /**
     * 返回连接池中连接数量
     * @return size
     * */
    public static int getCount(){
        return pools.size();
    }

    /**
     * 获得连接的方法
     *
     * */
    @Override
    public Connection getConnection() throws SQLException {
        //得到的是被增强的连接
        Connection connection = pools.removeFirst();
        //把被增强的连接换成增强的连接
        MyConnection myConnection = new MyConnection(connection,pools);
        return myConnection;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
