package Array;

public class MaxOfArray {
    public static void main(String[] args) {

        int[] maxOfArray = {4,-1,9,10,23};
        int maxIndex = 0;
        for (int i = 0; i < maxOfArray.length; i++) {
            if (maxOfArray[i] > maxOfArray[maxIndex]){
                maxIndex = i;
            }

        }
        System.out.println(maxIndex);

    }
}
