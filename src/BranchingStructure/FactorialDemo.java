package BranchingStructure;

public class FactorialDemo {
    public static void main(String[] args) {
        int sum = 1;
        int factorial = 0;
        for (int i = 1;i <= 10;i++){
            sum *= i;
            factorial += sum;
        }
        System.out.println("1!+2！+3！+4！+5！+6！+7！+8！+9！+10！" + factorial);
    }
}
