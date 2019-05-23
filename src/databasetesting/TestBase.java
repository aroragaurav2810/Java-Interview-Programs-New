package databasetesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

import studystuff_reflection_and_generic_enum_database.DatabaseUtilities;

public class TestBase {
	
	Logger log = Logger.getLogger("devpinoyLogger");
	String url;
	String uname ;
	String password;
	
	static Connection con;
	static Statement stmt;
	ResultSet rs;
	public TestBase() throws Exception
	{
		

		Properties CONFIG=new Properties();
		FileInputStream fis=new FileInputStream(new File("D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\src\\studystuff_reflection_and_generic_enum_database_resources\\CONFIG.properties"));
		CONFIG.load(fis);
		url = CONFIG.getProperty("DB_URL");
		uname = CONFIG.getProperty("DB_UNAME");
		password = CONFIG.getProperty("DB_PASSWORD");
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,password);
		stmt=con.createStatement();
		
		
	}
	
	
	public static void closeConnection() throws SQLException
   	{
   		con.close();
   		//dboperation.closeConnection();
   	}
	

	public static ResultSet getResultSet(String query) throws Exception
	{
		ResultSet rs=stmt.executeQuery(query);
		
		return rs;
	}

}
