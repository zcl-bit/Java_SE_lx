package BranchingStructure;

public class VipIfIfDemo {
    public static void main(String[] args) {
        int money = (int)(Math.random()*1000);
        System.out.println("购物金额"+money);
        if (money>=100){
            String identity = ((int)(Math.random()*2))==0?"vip":"People";
            System.out.println("身份"+identity);
            if (identity=="vip"){
                if (money>=200){
                    System.out.println("购物打7.5折");
                }else {
                    System.out.println("购物打8折");
                }
            }else {
                System.out.println("购物打9折");
            }

        }else {
            System.out.println("购物金额不足不进行打折");
        }
    }
}
