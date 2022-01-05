package Array;

public class TwoArray {
    public static void main(String[] args) {
        int[][] doubleArray = new int[6][7];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = 2 * i + 1;
            }
        }
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + "\t");
            }
            System.out.println();
        }
        int i = 0 ;
        for (int temp[] : doubleArray) {
            for (int b: temp) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
