package dbutils;

import utils.JDBCUtils;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author: zcl
 * @create: 2022/1/14 9:33
 * 连接池类
 */
public class EasySource {
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
    /**
     * 获取连接的方法
     * @return 连接的对象
     */
    public Connection getAbc(){
        Connection connection = pools.removeFirst();
        return connection;
    }

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
}
