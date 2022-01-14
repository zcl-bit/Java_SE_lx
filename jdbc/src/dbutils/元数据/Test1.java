package dbutils.元数据;

import utils.C3P0Utils;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;

/**
 * @author: zcl
 * @create: 2022/1/14 16:28
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        /**
         * ParameterMetaData类:
         * 概述:
         * 是一个参数元数据类,可以用来获取参数的元数据
         * 使用:
         * 1.获取参数元数据类对象
         * PreparedStatement对象调用getParameterMetaData()方法
         * 2.获取参数的元数据 ParameterMetaData相关的API
         * - int getParameterCount(); 获得参数个数
         * - int getParameterType(int param) 获取指定参数的SQL类 型。 (注:MySQL不支持获取参数类型)
         * */
        //1、获取连接
        Connection connection = C3P0Utils.getConnection();
        //2、预编译sql语句
        String sql = "select * from user where username = ? and password = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        //3、通过PreparedStatement对象获取参数元数据对象
        ParameterMetaData pmd = ps.getParameterMetaData();
        //4、获取参数个数元数据  参数个数就是参数的元数据
        int count = pmd.getParameterCount();
        System.out.println("sql语句的参数个数是："+count);
        //5、获取参数类型元数据 参数类型也是参数的元数据   无用 报错
//        int parameterType = pmd.getParameterType(1);
//        System.out.println(parameterType);
//        String parameterTypeName = pmd.getParameterTypeName(1);
//        System.out.println(parameterTypeName);

    }


}
