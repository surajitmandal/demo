package jdbc_example;
import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
try{  
	
	
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal", "root", "");
	// here sonoo is database name, root is username and password
	//Statement stmt = con.createStatement();
	//ResultSet rs = stmt.executeQuery("select * from emp");
	System.out.println("Before table Update");
	PreparedStatement stmt2=con.prepareStatement("select * from emp");  
	ResultSet rs=stmt2.executeQuery();  
	
	
	
	while(rs.next()){  
	System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
	}
	
	
	System.out.println("Tabble is updating");
	PreparedStatement stmt=con.prepareStatement("delete from emp where id=?");  
	stmt.setInt(1,101);//1 specifies the first parameter in the query  
	//stmt.setString(2,"Ratan");  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
//int i=stmt.executeUpdate();  
//System.out.println(i+" records inserted");  
	
	System.out.println("Before table Update");
	PreparedStatement stmt1=con.prepareStatement("select * from emp");  
	ResultSet rs1=stmt1.executeQuery();  
	
	while(rs1.next()){  
	System.out.println(rs1.getInt(1)+" "+rs1.getString(2)); 
	}
  
	
	ResultSetMetaData rsmd=rs1.getMetaData();  
	System.out.println("Total columns: "+rsmd.getColumnCount());  
	System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
	System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
	
	
	DatabaseMetaData dbmd=con.getMetaData();  
	  
	System.out.println("Driver Name: "+dbmd.getDriverName());  
	System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	System.out.println("UserName: "+dbmd.getUserName());  
	System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
	
	con.close();  
  
}catch(Exception e){ System.out.println(e);}  
}
}   