public class StringAllNonRepeatedChars {
    public static void main(String[] args) {
        String data = "geeksfxxorgeeks";
        String temp = data;
        for (int x = 0, i = 0; i < data.length(); i++) {
            if (data.charAt(x) == data.charAt(i)) {
                data = data.replaceAll(data.charAt(x) + "", "");
                i = x;
            }
            if (i == data.length() - 1) {
                x++;
                i = x;
            }
        }
        System.out.println(data);
        System.out.println(temp.indexOf(data.charAt(0)));
    }
}
