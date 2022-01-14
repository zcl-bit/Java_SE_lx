package utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author: zcl
 * @create: 2022/1/14 13:21
 */
public class DruidUtils {
    /**
     * 创建druid连接池对象
     * */
    private static DataSource DATA_SOURCE;
    static{
        try{
            Properties properties = new Properties();
            properties.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            DATA_SOURCE = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得连接的方法
     * @return 连接
     * @throws Exception
     * */
    public static Connection getConnection() throws Exception {
        return DATA_SOURCE.getConnection();
    }
    /**
     * 获得连接池的方法
     * @return
     * */
    public static DataSource getDataSource(){
        return DATA_SOURCE;
    }


    /**
     * 释放资源
     *
     * @param connection
     * @param resultSet
     * @param statement
     * @return 释放资源
     * @throws Exception
     */
    public static void release(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
