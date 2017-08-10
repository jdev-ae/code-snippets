import java.io.*;
import java.net.URL;
import java.net.URLConnection;


public class JFTP {

    /**
     * How to Download a file via FTP
     */
    public static String      server = "ftp.server.com";
    public static String userName = "username";
    public static String password = "password";
    public static String fileName = "index.html";

    public static void main(String[] args) throws Exception {
        System.out.println("Connecting to FTP server...");
        // Connection String
        URL url = new URL(
                "ftp://" + userName + ":" + password + "@" + server
                + "/public_html/" + fileName + ";type=i");
        // URL url = new URL("ftp://"+userName+":"+password+"@"+server+"/"+fileName+";type=i");
        URLConnection con = url.openConnection();
        BufferedInputStream in = new BufferedInputStream(con.getInputStream());
        System.out.println("Downloading file.");
        // Downloads the selected file to the C drive
        FileOutputStream out = new FileOutputStream("C:\\" + fileName);
        int i = 0;
        byte[] bytesIn = new byte[1024];

        while ((i = in.read(bytesIn)) >= 0) {
            out.write(bytesIn, 0, i);
        }
        out.close();
        in.close();
        System.out.println("File downloaded.");
    }
}
