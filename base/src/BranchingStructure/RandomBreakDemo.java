package BranchingStructure;
/*
* 生成0-100随机数，直到生成88为止，停止循环！
*
* */
public class RandomBreakDemo {
    public static void main(String[] args) {
//        int count = 0;
//        while (true){
//            int i = (int)(Math.random()*101);
//            System.out.println(i);
//            if (i == 88){
//                break;
//            }
//            count++;
//
//        }
//
//        System.out.println(count);

        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=10;j++){
                System.out.println("(" + i + "," + j + ")");
                if (i==6&&j==6){
                    return;
                    //break;
                }
            }
        }
    }
}
