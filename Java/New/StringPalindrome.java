public class StringPalindrome {
    public static void main(String[] args) {
        String str = "jookooj";
        System.out.println(new StringBuffer(str).reverse().toString().equals(str));
    }
}
