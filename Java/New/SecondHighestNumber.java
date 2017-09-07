public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] nums = {8,  9, 56, 98, 99, 96, 1, 5, 100};
        int n1 = nums[0], n2 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (n1 < nums[i]) {
                n2 = n1;
                n1 = nums[i];
            } else if(n2 < nums[i]) {
                n2 = nums[i];
            }
        }

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
    }
}
