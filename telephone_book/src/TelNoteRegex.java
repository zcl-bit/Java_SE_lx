import java.util.Scanner;

/**
 * @author: zcl
 * @create: 2022/1/6 10:27
 * 数据校验类
 */
public class TelNoteRegex {
    /**
     *  对菜单输入选项的验证
     * @param min
     * @param max
     * @return
     */
    public int menuItemValidate (int min, int max ){
        //定义验证菜单项的正则表达式
        String regex = "[1-9]{1}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入正确数字，最小是："+min+"\t"+"最大是："+max);
            String input = scanner.nextLine();
            if(input.matches(regex)){
                int inputNum = Integer.parseInt(input);
                if(inputNum >= min && inputNum <= max){
                    return inputNum;
                }else{
                    System.out.println("您输入的菜单项不符，请重新输入！");
                }
            }else{
                System.out.println("输入数字错误，请检查！");
            }
        }
    }

    /**
     *  对用户输入姓名的验证
     *  字母可以是大写或者小写，长度1-10之间的
     * @return
     */
    public String nameValidate ( ){
        //验证姓名的正则表达式
        String regex = "[a-zA-Z]{1,10}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入姓名： 格式为1-10之间的大写或小写字母");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("您当前输入的姓名有误，请重新输入！");
            }
        }
    }

    /**
     * 对用户输入年龄的验证
     * 年龄的格式要求：10-99之间的
     * @return
     */
    public String ageValidate ( ){
        //对年龄校验的正则表达式
        String regex = "[1-9]{1}[0-9]{1}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入年龄：格式为10-99之间");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("您输入的年龄格式有误，请重新输入！");
            }
        }
    }

    /**
     *  对用户输入性别的验证
     *  性别的输入要求：男（m 或 M） 女（f 或 F）
     * @return
     */
    public String sexValidate ( ){
        //对性别验证的正则表达式
        String regex ="[m|M|f|F]{1}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("输入性别：(男 m or M) (女 f or F)");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("输入性别格式有误，请重新输入！");
            }
        }
    }

    /**
     * 对用户输入电话号码的验证
     * 电话号码要求：允许带有区号的座机号，允许手机号
     * @return
     */
    public String telNumValidate ( ){
        //对电话号码验证的正则表达式
        String regex = "(\\d{3,4}-\\d{7,8})|([1]{1}\\d{10})";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入电话号码：可以是座机号或者是手机号。");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("输入的电话号码有误，请重新输入！");
            }
        }
    }

    /**
     * 对用户输入地址的验证
     * 地址格式要求：字母或者数字，长度1,50
     * @return
     */
    public String addressValidate ( ){
        //对地址验证的正则表达式
        String regex = "\\w{1,50}";
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入地址：格式为字母或数字，长度为1,50");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else{
                System.out.println("您输入的地址格式有误，请重新输入。");
            }
        }
    }

    public static void main(String[] args) {
        TelNoteRegex telNoteRegex = new TelNoteRegex();
/*        int menuItem = telNoteRegex.menuItemValidate(1,6);
        System.out.println(menuItem);*/
/*        String name = telNoteRegex.nameValidate();
        System.out.println(name);*/
/*        String telNumValidate = telNoteRegex.telNumValidate();
        System.out.println(telNumValidate);*/
/*        String ageValidate = telNoteRegex.ageValidate();
        System.out.println(ageValidate);*/
/*        String sexValidate = telNoteRegex.sexValidate();
        System.out.println(sexValidate);*/
/*        String addressValidate = telNoteRegex.addressValidate();
        System.out.println(addressValidate);*/
    }


}
