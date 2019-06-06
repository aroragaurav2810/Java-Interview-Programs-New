package ResultSetToPojoList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Base 

{

	
	public static DatabaseUtility db=new DatabaseUtility();
	public static Connection con=null;
	public static Statement stmt=null;
	public static ResultSet rs=null;
	
	public Base() throws SQLException, ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@(DESCRIPTION=(FAILOVER=on)(LOAD_BALANCE=yes)(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=nj4whsqascan)(PORT=1521)))(CONNECT_DATA=(FAILOVER_MODE=(TYPE=select)(METHOD=basic)(RETRIES=180)(DELAY=5))(SERVER=dedicated)(SERVICE_NAME=LNS_APP)))", "loansbuild", "loansbuild");
		
		stmt=con.createStatement();
		
	}
	
	
}
