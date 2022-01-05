package BranchingStructure;

public class WhileForHundredCountDemo {
    public static void main(String[] args) {
        int oddNumber = 0;
        int even = 0;
        for (int i = 0;i <= 100;i++){
            if (i % 2 == 1){
                oddNumber += i;
            }else {
                even += i;
            }
        }
        System.out.println("1-100之间偶数的和为：" + even);
        System.out.println("1-100之间奇数的和为：" + oddNumber);

        int i = 0;
        int whileOddNumber = 0;
        int whileEven = 0;
        while (i <= 100){
            if (i % 2 == 1){
                whileOddNumber += i;
            }else {
                whileEven += i;
            }
            i++;
        }

        System.out.println("1-100之间的偶数和为：" + whileEven);
        System.out.println("1-100之间的奇数和为：" + whileOddNumber);


    }
}
