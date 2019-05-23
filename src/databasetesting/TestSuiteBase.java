package databasetesting;

import org.testng.annotations.BeforeSuite;

public class TestSuiteBase {

	
@BeforeSuite
public void initiallizeDatabaseConnection() throws Exception
{
	TestBase obj=new TestBase();
}
	
	

}
