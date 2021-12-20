import java.util.Scanner;

public class Administrator {
    String loginName = "admin";
    String password = "123";
    public void introduce(){
        System.out.println(loginName);
        System.out.println(password);
    }

    public static void main(String[] args) {
        Administrator administrator = new Administrator();
        System.out.println(administrator.loginName);
        System.out.println(administrator.password);
        administrator.introduce();

        Scanner sc = new Scanner(System.in);
        System.out.println("修改密码");
        while(true){
            System.out.println("请输入用户名称：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (name.equals(administrator.loginName) && password.equals(administrator.password)){
                System.out.println("请输入新的用户名：");
                administrator.loginName = sc.nextLine();
                System.out.println("请输入新的密码：");
                administrator.password = sc.nextLine();
                System.out.println("修改成功");
                break;
            }else {
                System.out.println("用户名和密码不正确，请重新输入");
            }
        }
        administrator.introduce();
    }
}
