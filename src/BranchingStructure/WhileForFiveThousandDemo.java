package BranchingStructure;

public class WhileForFiveThousandDemo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0;i<1000;i++){
            if (i % 5 == 0){
                System.out.print(i + "\t");
                count++;
            }
            if (count >= 3){
                System.out.println();
                count = 0;
            }
        }
//        for (int i = 1;i <= 1000;i++){
//            if (i % 5 == 0){
//                System.out.print(i + "\t");
//                count++;
//                if (count % 3 == 0){
//                    System.out.println();
//                }
//            }
//
//        }
//
//        for (int i = 0 ;i <= 1000;i++){
//            if (i % 5 == 0){
//                System.out.print(i + "\t");
//            }
//            if (i % (5*3) == 0){
//                System.out.println();
//            }
//        }

//        int i = 0;
//        int whileCount = 0;
//        while (i <= 1000){
//            if (i % 5 == 0){
//                System.out.print(i + "\t");
//                whileCount++;
//            }
//            i++;
//            if (whileCount % 3 == 0){
//                System.out.println();
//            }
//        }
    }
}
