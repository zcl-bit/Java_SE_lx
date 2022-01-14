package dbutils.元数据;

import utils.C3P0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author: zcl
 * @create: 2022/1/14 16:28
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        /* ResultSetMetaData类:
        概述:是一个结果集元数据类,可以用来获取结果集的元数据
        使用:
        1.获取结果集元数据类的对象 ResultSet的对象调用getMetaData()方法
        2.获取结果集的元数据 ResultSetMetaData 相关的API
         - getColumnCount(); 获取结果集中列项目的个数
          - getColumnName(int column); 获得数据指定列的列名
           - getColumnTypeName();获取指定列的SQL类型
            - getColumnClassName();获取指定列SQL类型对应于Java的类型
            */
        //1、获取连接
        Connection connection = C3P0Utils.getConnection();
        //2、预编译sql语句
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //3、设置参数
        ps.setString(1,"zs");
        ps.setString(2,"123456");
        //4、执行sql语句
        ResultSet resultSet = ps.executeQuery();
        //5、获取结果集的元数据对象
        ResultSetMetaData metaData = resultSet.getMetaData();

        //1.获取列的数量
        int columnCount = metaData.getColumnCount();
        System.out.println("列的个数："+ columnCount);
        //2.获取列的名字
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(metaData.getCatalogName(i));
        }
        System.out.println("==============================");
        //3.获取列的mysql类型
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(metaData.getColumnTypeName(i));
        }
        System.out.println("==============================");
        //4.获取列在mysql中的类型对应于Java中的类型
        for (int i = 1; i <= columnCount; i++) {
            System.out.println(metaData.getColumnClassName(i));
        }
        System.out.println("==============================");
    }
}
