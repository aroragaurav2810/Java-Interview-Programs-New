package studystuff_reflection_and_generic_enum_database;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TestRule extends TestBase

{
	
	// generic method in java
	// generic classes and methods provide compile-time safety
	public <T> TestRule() throws Exception 
	{
		// It is basically used to active all DBConnections and DBUtilities class object
		super();
	}

	
	// This function provides employee list and for which you would require data from table employee 
	// which is nothing but a result set and I would say result set by by passing query and 
	// finally convert that result set into list
	// So, Requirement is : 
	// 1. getQueryAsString()
	// 2. getResultSet() or getDataFromDB() by passing the query
	// 3. convert result set into list or pass result set to method toList() 
	
	public <T> List<T> getList(TestEnum ob,Class<T> listclass) throws Exception
	{
		String query=ob.getQueryAsString();
		ResultSet resultset=super.getResultSet(query);
		// In toList(ResultSet rs, Class<T> listClass) method, we have to pass both result set and the type of list you want
			/*	while(rs.next())
				{
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}*/
		
		List<T> list = (List<T>) db.toList(resultset, listclass);
		return list;
	}
	
	


}
