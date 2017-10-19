import java.util.Arrays;

public class ArrayAdd {

    public static void main(String[] args) {

        int[] A = { 1, 2, 3 };
        int[] B = { 4, 5, 6 };
        int[] C = new int[A.length + B.length];

        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);

        System.out.println(Arrays.toString(C));

    }

}