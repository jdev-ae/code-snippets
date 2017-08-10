import java.sql.*;

public class JDBC1 {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Connection c = DriverManager.getConnection(url, "private1", "private1");
			System.out.println("Connected...");
			String query = " insert into stu values(4,'Kumar', 'EEE')";
			Statement s = c.createStatement();
			int i = s.executeUpdate(query);
			System.out.println("Row inserted...");
			s.close();
			r.close();
			c.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
