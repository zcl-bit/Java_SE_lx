package BranchingStructure;

public class CarIfDemo {
    public static void main(String[] args) {
        int money = (int)(Math.random()*1000);
        System.out.println("存款金额："+money+"(万元)");

        if (money>=500){
            System.out.println("建议买凯迪拉克");
        }else if (money>=100){
            System.out.println("建议买帕萨特");
        }else if (money>=50){
            System.out.println("建议买伊兰特");
        } else if (money>=10){
            System.out.println("建议买奥托");
        }else {
            System.out.println("建议买捷安特");
        }

    }
}
