package BranchingStructure;

public class CycleHomeWorkNineNine {
    public static void main(String[] args) {

        /**
        * 左上
        **/

        for (int i= 1; i < 10;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }


        /**
        * 左下
        * */

       for (int i = 9;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j + "*" + i + "=" + i*j + "\t");

            }
            System.out.println();
        }


        /**
        * 右上
        * */
        for (int i =1;i<10;i++){

            for (int j=9;j>=1;j--) {
                    if (j>i) {
                        System.out.print("\t"+"\t");
                    }else {
                        System.out.print(j + "*" + i + "=" + i * j + "\t");
                    }

            }
            System.out.println();
        }
        /**
         * 右下
         */
        for (int i = 9;i>0;i--){
            for (int j=0;j<9-i;j++)
            {
                System.out.print("\t"+"\t");
            }

            for (int j=i;j>=1;j--){
                System.out.print(j + "*" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }



    }
}
