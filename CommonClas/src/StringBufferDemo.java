/**
 * @author: zcl
 * @create: 2021/12/28 13:39
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append(1.234).append("abc").append(true);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.delete(1,4));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123").append(1).append(false);
        System.out.println(stringBuilder);
    }
}
