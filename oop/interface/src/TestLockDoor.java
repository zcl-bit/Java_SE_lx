/**
 * @author: zcl
 * @create: 2021/12/26 13:41
 *
 * 接口特征：
 *  1、接口中的所有方法都是抽象方法，不能包含方法的实现
 *  2、接口中的所有方法的访问修饰权限都是public，不写并不是默认访问权限，而是public
 *  3、接口不能被实例化
 *  4、接口的子类必须要实现接口中的所有方法，跟抽象类有所不同，抽象类中的抽象方法必须要被子类实现
 *  5、子类可以拥有实现多个接口
 *  6、接口中的变量都是静态常量,如果变量没有使用static关键字修饰，他也表示静态常量,不用final关键字修饰也是常量
 *  7、接口中的方法和常量无论是否添加public修饰，默认的权限有且仅有一个，就是public
 *
 *  接口的使用：
 *      1、接口代表一种能力，接口中可以定义N个方法，子类在进行实现的时候，必须要实现这些方法
 *          将这些方法进行实现，就意味着具体了方法的能力
 *
 */
public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
//        Lock lock = new Lock();
        lockDoor.openDoor();
        lockDoor.openLock();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.photo();
        System.out.println(LockDoor.a);
//        LockDoor.a = 200;
    }
}
