package BranchingStructure;

public class WhileDemo {
    public static void main(String[] args) {
        int i = 1;
//        while(i<=100){
//            System.out.println("第"+i+"遍输出");
//            i++;
//        }
        int sum = 0;
        while(i<=100){
            if (i%2==0){
                sum += i;
            }

            i++;
        }
        System.out.println("100以内的偶数和为"+sum);
    }
}
