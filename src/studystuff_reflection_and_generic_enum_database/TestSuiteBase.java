package studystuff_reflection_and_generic_enum_database;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class TestSuiteBase 
{

	
	TestRule   test_rule=null;
	
	@BeforeSuite
	public void getDBProperties() throws Exception
	{
		test_rule=new TestRule();
	}
}
