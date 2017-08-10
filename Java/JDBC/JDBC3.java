import java.sql.*;

public class JDBC3 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection c = DriverManager.getConnection(url, "private1", "private1");
			System.out.println("Connected...");
			String query = " update stu set branch = 'ECE' where sno = 2";
			Statement s = c.preparedStatement();
			int i = s.executeUpdate(query);
			if (i > 0) {
				System.out.println(i + "Row(s) Updated...");
			} else {
				System.out.println("Updation failed");
			}
			s.close();
			c.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
