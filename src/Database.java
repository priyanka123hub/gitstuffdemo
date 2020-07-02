import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class Database {
	
	

	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";
		
Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/priyanil", "root", "root");
	
	ResultSet r=con.createStatement().executeQuery("select *from krishna where ID=1");
	while(r.next()) {
	System.out.println(r.getString("location"));
		System.out.println(r.getString("Name"));
		
	}
	

	

}
}