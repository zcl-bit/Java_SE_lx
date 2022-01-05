package BranchingStructure;

public class TenToSixteen {
    public static void main(String[] args) {

        /*
        *思路：
        * 1.啥是十六进制
        *   原理：将二进制中4位为一个十六进制位
        * 2.对给定的整数进行二进制的每四位的获取
        * 3.咋获取每四位呢？其实就是获取四位中1，可以通过&运算的方式完成
        * 4.而且想要获取下四位，可以通过对原数据进行无符号右移的方式
        *
        *
        *
        * 步骤：
        * 1.定义变量记录该整数
        * 2.对该变量进行&运算，既然是获取四位，就&四个1，二进制四个1就是十进制的15
        * 3.对源数据进行无符号右移四位，
        *
        *
        * */

        int number = 26;
        int n1;
        //&15获取最低四位
//        int n1  = number & 15;
//        System.out.println("n1=" + (char)(n1-10+'a'));
//        //对number进行右移
//        number = number >>> 4;
//        //在进行&运算
//        int n2 = number & 15;
//        System.out.println("n2=" + (char)(n2+'0'));


        for (int x = 0;x<8;x++){
            n1 = number & 15;
            if (n1 > 9){
                System.out.println((char)(n1-10+'A'));
            }else {
                System.out.println(n1);
            }

            number = number >>> 4;
        }
    }
}
