package dbutils.dbutils;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import utils.C3P0Utils;

import java.sql.SQLException;

/**
 * @author: zcl
 * @create: 2022/1/14 14:24
 */
public class Demo {
    @Test
    public void insert() throws Exception {
        //1、创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //2、调用update方法
        int rows = queryRunner.update("insert into user values (null,?,?,?)", "ww", "123456", "老王");
        System.out.println("受影响的行数:" + rows);
    }

    @Test
    public void update() throws Exception {
        //1、创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //2、调用update方法
        int rows = queryRunner.update("update user set password = ? where id= ?", "abcdef", 2);
        System.out.println("受影响的行数:" + rows);
    }

    @Test
    public void delete() throws SQLException {
        //1、创建QueryRunner对象，传入连接池
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //2、调用update方法
        int rows = queryRunner.update("delete from user where id = ?", 4);
        System.out.println("受影响的行数:"+rows);
    }
}
