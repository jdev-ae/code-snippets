public class StringPermutations {
    public static void main(String[] args) {
        permutation("STRING");
    }

    public static void permutation(String string) {
        permutation("", string);
    }

    private static void permutation(String prefix, String string) {
        int n = string.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + string.charAt(i), string.substring(0, i) + string.substring(i + 1, n));
        }
    }

}
