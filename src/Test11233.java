import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test11233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
