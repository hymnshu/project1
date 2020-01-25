package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
 Class.forName("oracle.jdbc.driver.OracleDriver")		;
 Connection con= null;
 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","121@irteL");
 System.out.println(con);
	}
  

}
