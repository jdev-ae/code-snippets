public class SumOf2NumbersInArray {

    public SumOf2NumbersInArray(int[] a, int sum) {
        int f = 0, l = a.length - 1;
        boolean flag = false;
        if (a[l - 1] + a[l] < sum) {
            System.out.println("Pair not found");
        } else {
            while (f != l) {
                if (a[f] + a[l] == sum) {
                    flag = true;
                    break;
                } else if (a[f] + a[l] > sum) {
                    l--;
                } else if (a[f] + a[l] < sum) {
                    f++;
                }
            }
            if (flag) {
                System.out.println("Pair found at [" + f + ", " + l + "] -> (" + a[f] + " + " + a[l] + " = " + sum + ")");
            } else {
                System.out.println("Pair not found");
            }
        }
    }
}