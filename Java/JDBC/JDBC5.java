import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC5 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection c = DriverManager.getConnection(url, "private1", "private1");
            System.out.println("Connected...");
            String query = "update stu set sname = ? where sno = ?";
            PreparedStatement ps = c.prepareStatement(query);
            System.out.print("Enter SNO: ");
            int sno = Integer.parseInt(br.readLine());
            System.out.print("Enter Name: ");
            String sname = br.readLine();
            ps.setString(1, sname);
            ps.setInt(2, sno);
            ps.execute();
            System.out.println("Row(s) Updated...");
			ps.close();
            c.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
