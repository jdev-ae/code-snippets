import java.util.Arrays;

public class ArrayAdd {

    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
        int[] array1and2 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);

        System.out.println(Arrays.toString(array1and2));

    }

}