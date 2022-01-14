package dbutils.dbutils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;
import utils.C3P0Utils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: zcl
 * @create: 2022/1/14 15:42
 */
public class Demo2 {
    /**
     * api:
     *  public queryRunner(DataSource ds);
     *  参数ResultSetHandler是一个接口,表示结果集处理者(对查询结果的封装):
     *  ResultSetHandler接口的实现类:
     *  ArrayHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Object数组中
     *  BeanHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个javaBean对象中
     *  MapHandler:适合查询结果是一条记录的,会把这条记录的数据封装到一个Map集合中

     *  ArrayListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Object数组 中,然后把这些数组添加到List集合中
     *  BeanListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个javaBean对象 中,然后把这些javaBean对象添加到List集合中
     *  MapListHandler:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后 把这些Map集合添加到List集合中
     *  KeyedHandle:适合查询结果是多条记录的,会把每条记录的数据封装到一个Map集合中,然后把这 些Map集合添加到另一个Map集合中

     *  ColumnListHandler:适合查询结果是单列多行的,会把该列的所有数据存储到List集合中

     *  ScalarHandler:适合查询结果是单个值的,会把这个值封装成一个对象
     * */

    @Test
    /**
     * 查询结果是一条的--数组
     * */
    public void select1() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        Object[] arr = queryRunner.query("select * from user where id = ?", new ArrayHandler(), 1);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    /**
     * 查询结果是一条的--JavaBean
     * */
    public void select2() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        User query = queryRunner.query("select * from user where id = ?", new BeanHandler<User>(User.class), 1);
        System.out.println(query);
    }

    @Test
    /**
     * 查询结果是一条的--Map集合
     * */
    public void select3() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        Map<String, Object> query = queryRunner.query("select * from user where id = ?", new MapHandler(), 1);
        System.out.println(query);
    }

    @Test
    /**
     * 查询结果是单列多条的--数组
     * */
    public void select4() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        String sql = "select username from user";
        List<Object[]> query = queryRunner.query(sql, new ArrayListHandler());
        for (Object[] arr:
             query) {
            System.out.println(Arrays.toString(arr));
        }
    }

    @Test
    /**
     * 查询结果是多行多列的--JavaBean
     * */
    public void select5() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        List<User> query = queryRunner.query("select * from user", new BeanListHandler<User>(User.class));
        for (User user: query) {
            System.out.println(user);
        }
    }

    @Test
    /**
     * 查询结果是多行多列的--Map集合
     * */
    public void select6() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        List<Map<String, Object>> query = queryRunner.query("select * from user", new MapListHandler());
        for (Map<String, Object> user: query) {
            for (String key: user.keySet()) {

                System.out.println(key + ":" + user.get(key));
            }
            System.out.println("===================================");
        }
    }

    @Test
    /**
     * 查询结果是多条的--Map集合
     * */
    public void select7() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        Map<Object,Map<String,Object>> map = queryRunner.query("select * from user", new KeyedHandler());
        Set<Object> keys = map.keySet();
        for (Object key: keys) {
            Map<String,Object> m = map.get(key);
            System.out.println(key + "=" + m);
        }
    }

    @Test
    /**
     * 查询结果是单列多行的--List集合
     * */
    public void select8() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        List<Object> list = queryRunner.query("select username from user", new ColumnListHandler());
        System.out.println(list);
    }

    @Test
    /**
     * 查询结果是单个值的--对象
     * */
    public void select() throws SQLException {
        //创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

        //调用query方法
        Object query = (Long)queryRunner.query("select count(*) from user", new ScalarHandler());
        System.out.println(query);
    }
}
