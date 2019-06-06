package ResultSetToPojoList;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public enum QueryClass 
{

	
	EMPLOYEE("Employee.sql");
	
	String queryFile=null;
	
	private QueryClass(String queryFile) 
	{
		this.queryFile=queryFile;
	}
	
	public String getQueryAsString() throws IOException
	{
		File file=new File(System.getProperty("user.dir") + "//src//ResultSetToPojoList//"+queryFile);
		String queryAsString=FileUtils.readFileToString(file);
		return queryAsString;
	}
	
}
