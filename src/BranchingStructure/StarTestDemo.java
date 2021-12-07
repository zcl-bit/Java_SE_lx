package BranchingStructure;

public class StarTestDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (( i + j ) % 2 == 1){
                    System.out.print("#" + "\t");
                }else {
                    System.out.print("*" + "\t");
                }

            }
            System.out.println();

        }
    }
}
