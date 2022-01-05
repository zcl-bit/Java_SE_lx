package BranchingStructure;

public class SwitchQuicklyDemo {
    public static void main(String[] args) {
        int number = (int)(Math.random()*5+1);
        System.out.println(number);
        switch (number){
            case 1:
                System.out.println("拨爸爸的号");
                break;
            case 2:
                System.out.println("拨妈妈的号");
                break;
            case 3:
                System.out.println("拨爷爷的号");
                break;
            case 4:
                System.out.println("拨奶奶的号");
                break;
            default:
                System.out.println("按键错误");
        }
    }
}
