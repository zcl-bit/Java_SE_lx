package BranchingStructure;
/*
把100-150之间不能被3整除的数输出
**/
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 100;i<=150;i++){
            if (i%3==0){

                continue;

            }
            System.out.println(i);

        }
    }
}
