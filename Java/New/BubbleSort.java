import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2, 1, 9, 5, 22, 21};
        bubbleSort(nums);
//        System.out.println(Arrays.toString(nums));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
                // 3rd high
//                if(i ==3) {
//                    System.out.println(Arrays.toString(arr));
//                }
            }
        }
    }
}
