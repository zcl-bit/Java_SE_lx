/**
 * @author: zcl
 * @create: 2021/12/27 14:31
 */
public class GenderException extends Exception{
    public GenderException(){
        System.out.println("性别异常");
    }

    public GenderException(String msg){
        System.out.println(msg);
    }
}
