package studystuff_interview_questions_all;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection 

{

	// What is DriverManager Class
	// What is  Connection Interface
	// What is PreparedStatement Interface
	// What is Statement Interface
	// What is ResultSet Interface
	// What is ResultSetMetadata Interface
	// What is DataBaseMetaData Interface
	
	
	
	
	//static Connection con;
	static PreparedStatement prepst;
	static Statement st;
	static ResultSet rs;
	public static void main(String[] args) throws SQLException
	
	{
		// Step 1:
		// Register or load a driver:
		// The forName() method of Class class is used to register the driver class. This method is used to dynamically load the driver class.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Step 2:
		// Create a connection
		// The getConnection() method of DriverManager class is used to establish connection with the database.
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/automation","root","12345");
		
		// Step 3:
		// Prepare or Create a Statement
		// The createStatement() method of Connection interface is used to create statement. 
		// The object of statement is responsible to execute queries with the database.
		st=con.createStatement();
		//prepst=con.prepareStatement("insert into emp values(318,"+"Gaurav"+",460)(319,"+"Gulshan"+",380)(320,"+"Hemant"+",410)");
		
		
		// Step 4:
		// Create a ResultSet for handling the query result that executed
		// The executeQuery() method of Statement interface is used to execute queries to the database. 
		// This method returns the object of ResultSet that can be used to get all the records of a table.
		String query="select * from emp";
		rs=st.executeQuery(query);
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		
		// Step 5:
		// Close a Connection
		con.close();
	}

}
