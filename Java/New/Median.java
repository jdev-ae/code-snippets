import java.util.Arrays;

public class Median {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Median: " + median(a));
    }

    private static double median(int[] numArray) {
        Arrays.sort(numArray);
        int middle = ((numArray.length) / 2);

        if (numArray.length % 2 == 0) {
            int medianA = numArray[middle];
            int medianB = numArray[middle - 1];
            return (medianA + medianB) / 2.0;
        } else {
            return numArray[middle];
        }
    }
}
