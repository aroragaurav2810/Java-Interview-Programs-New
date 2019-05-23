package databasetesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public enum TestEnum

{
	EmployeeTable("Employee.sql"),
	StudentTable("Student.sql");
	
	String queryfile;

	
	
	
	
	private TestEnum(String sqlfile)
	{
		queryfile=sqlfile;
	}
	

	public String getQueryAsString() throws Exception
	{
		String query=null;
		File file=new File("D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\src\\databasetesting\\"+queryfile);
		query=FileUtils.readFileToString(file);
		return query;
	}
	
}
