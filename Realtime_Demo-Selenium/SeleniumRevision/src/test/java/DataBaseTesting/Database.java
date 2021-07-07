package DataBaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@TNS","UserName","Password");
		Statement st = c.createStatement();
		ResultSet rset = st.executeQuery("SELECT * FROM CUSTOMERS");
		ResultSetMetaData rsmd = rset.getMetaData();
		while(rset.next()){
			
			
			
		}
	}

}
