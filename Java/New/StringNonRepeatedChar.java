public class StringNonRepeatedChar {
    public static void main(String[] args) {
        String data = "geeksfxxorgeeks";
        String temp = data;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(0) == data.charAt(i)) {
                data = data.replaceAll(data.charAt(0) + "", "");
                i = 0;
            }
        }
        System.out.println(data);
        System.out.println(temp.indexOf(data.charAt(0)));
    }
}
