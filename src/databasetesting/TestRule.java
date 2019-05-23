package databasetesting;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import studystuff_reflection_and_generic_enum_database.DatabaseUtilities;

public class TestRule


{
	
	
	
	public  DatabaseUtility db;
	public <T>  List<T> getList(TestEnum obj,Class<T> listclass) throws Exception
	{
		db = new DatabaseUtility();
		List<T> list=new ArrayList<T>();
		String query=obj.getQueryAsString();
		ResultSet rs=TestBase.getResultSet(query);
		list=db.toList(rs, listclass);
		
		return list;
		
	}


}
