package comAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyClass {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","Ashok@1997");
		System.out.println("Connected");
				
		
		
		
	}

}
