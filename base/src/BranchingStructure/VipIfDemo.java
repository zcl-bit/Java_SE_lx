package BranchingStructure;

public class VipIfDemo {
    public static void main(String[] args) {
        int number = (int)(Math.random()*10000);
        System.out.println("会员积分:"+number);

        if (number<2000){
            System.out.println("享受9折");
        }else if (number>=2000 & number<4000){
            System.out.println("享受8折");
        }else if (number>=4000 & number<8000){
            System.out.println("享受7折");
        }else{
            System.out.println("享受6折");
        }
    }
}
