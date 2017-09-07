public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 1, b = 1, c;
        System.out.print("1, 1, ");
        for (int i = 0; i < 10; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}
