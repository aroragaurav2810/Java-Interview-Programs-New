package studystuff_reflection_and_generic_enum_database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

public class TestBase 

{	
	Logger log = Logger.getLogger("devpinoyLogger");
	String url;
	String uname ;
	String password;
	DatabaseUtilities2 db;
	public String resultsheetname;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	// generic method in java
	// generic classes and methods provide compile-time safety
	public <T> TestBase() throws  Exception
	{
		Properties CONFIG=new Properties();
		FileInputStream fis=new FileInputStream(new File("D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\src\\studystuff_reflection_and_generic_enum_database_resources\\CONFIG.properties"));
 
		CONFIG.load(fis);
		url = CONFIG.getProperty("DB_URL");
		uname = CONFIG.getProperty("DB_UNAME");
		password = CONFIG.getProperty("DB_PASSWORD");
		resultsheetname =  CONFIG.getProperty("RESULT_SHEET_NAME");
		db = new DatabaseUtilities2();
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,password);
		stmt=con.createStatement();
	}
	
	
	public ResultSet getResultSet(String query) throws IOException, ClassNotFoundException, SQLException 
	{
		rs=stmt.executeQuery(query);
		return rs;
		
	}

	
}
