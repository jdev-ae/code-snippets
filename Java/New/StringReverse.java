public class StringReverse {
    public static void main(String[] args) {
        String data = "StringReverse";
        System.out.println(data);
        System.out.println("method 1: " + new StringBuffer(data).reverse());
        System.out.println("method 2: " + reverse(data));
    }

    public static String reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
