package BranchingStructure;

public class OneToTenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i<=10;i++){
            sum+=i;
            if (sum>=20){
                System.out.println("累加值大于20，当前数为"+i);
                break;

            }
        }
    }
}
