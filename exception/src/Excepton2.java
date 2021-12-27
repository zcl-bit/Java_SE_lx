import java.io.File;
import java.io.FileInputStream;

/**
 * @author: zcl
 * @create: 2021/12/27 14:12
 */
public class Excepton2 {
    public static void main(String[] args) {
        try{

            show();
        }catch (GenderException e){
            e.printStackTrace();
        }

//        new FileInputStream(new File(""));
        System.out.println(":");
    }

    public static void show() throws GenderException {
        String gender = "1234";
        if (gender.equals("男")){
            System.out.println("man");
        }else if (gender.equals("女")){
            System.out.println("woman");
        }else {
            //异常抛出
//            throw new Exception("性别出现错误");
            //用户自定义异常
            throw new GenderException("gender is wrong");
        }
    }
    public static void test1() throws Exception{
        System.out.println(1/0);
    }
    public static void test2() throws Exception{
        test1();
        System.out.println(1/0);
    }
    //异常捕获
    public static void test3() throws Exception{
        test2();
    }
    public static void test4() throws Exception{
        test3();
        System.out.println(1/0);
    }

}
