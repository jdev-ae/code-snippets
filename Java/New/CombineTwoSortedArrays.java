import java.util.Arrays;

public class CombineTwoSortedArrays {

    public static void main(String[] args) {
        int[] a = { 1, 5, 9, 11 };
        int[] b = { 4, 7, 21 };

        int[] c = new int[a.length + b.length];

        for (int i = 0, j = 0, k = 0; i < c.length; i++) {
            if (j < a.length && k < b.length) {
                if (a[j] < b[k]) {
                    c[i] = a[j];
                    j++;
                } else {
                    c[i] = b[k];
                    k++;
                }
            } else {
                if (j < a.length) {
                    c[i] = a[j];
                    j++;
                } else if (k < b.length) {
                    c[i] = b[k];
                    k++;
                }
            }
        }
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("C: " + Arrays.toString(c));
    }
}