import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PowerOf10 {
    public static void main(String[] args) {
        int no = 100;
        String rx = "^10*";
        Pattern p = Pattern.compile(rx);
        Matcher matcher = p.matcher("" + no);
        System.out.println("match: " + matcher.matches());
    }
}
