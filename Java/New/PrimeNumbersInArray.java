public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 8, 13, 17, 44, 97};
        for (int n : ints) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count > 2) return false;
            }
        }
        return true;
    }

}
