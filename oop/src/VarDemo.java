public class VarDemo {
    /*
    *
    * 变量：
    *   局部变量：
    *       定义在方法中的变量称为局部变量
    *           作用域：从定义的位置开始到整个方法结束
    *           注意：局部变量只能在当前方法中使用，其他地方无法使用
    *   成员变量：
    *       定义在方法外，类中的变量称为成员变量/全局变量
    *           作用域：整个类体内
    *
    * */

    public void show(){
        //局部变量
        int a  =10;
        String name = "张三";
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

        }
        int j =1;
        for (; j < 10; j++) {

        }

    }
}
