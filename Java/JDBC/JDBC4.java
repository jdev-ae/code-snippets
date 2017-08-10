import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBC4 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection c = DriverManager.getConnection(url, "private1", "private1");
            System.out.println("Connected...");
            String query = "insert into stu values(?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(query);
            System.out.print("Enter SNO: ");
            int sno = Integer.parseInt(br.readLine());
            System.out.print("Enter Name: ");
            String sname = br.readLine();
            System.out.print("Enter Branch: ");
            String branch = br.readLine();
            ps.setInt(1, sno);
            ps.setString(2, sname);
            ps.setString(3, branch);
            ps.execute();
            System.out.println("Row Inserted...");
			ps.close();
            c.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
