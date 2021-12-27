package exercise1;

import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2021/12/27 10:54
 */
public class StringChangeIntException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{

        }catch (NumberFormatException e){
            System.out.println("字符类型数据无法转换成整型数据");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("数据异常");
            e.printStackTrace();
        }
    }
    public int changeInt(String name){
//        int a = (int)name;
//        return a;
        return 0;
    }
}

