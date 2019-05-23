package databasetesting;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EmployeeTest extends TestSuiteBase

{

	
	
	ExcelUtilities eu=null;
	List<Employee> employee_list;
	String automaticdeviation;
	@Test
	public void getEmployeeList() throws Exception
	{
		
		eu = new ExcelUtilities("Deviation Checks");
		 automaticdeviation = "FR-4.4-Deviation-Check";
		TestRule tr=new TestRule();
		employee_list=tr.getList(TestEnum.EmployeeTable, Employee.class);
		System.out.println(employee_list);
		eu.createResultSheet(automaticdeviation);
		
	}
	
	@AfterTest
	public void  afterTest() throws EncryptedDocumentException, InvalidFormatException, IOException, IllegalArgumentException, IllegalAccessException, InstantiationException, SQLException
	{
		TestBase.closeConnection();
		eu.listToSheet(employee_list, automaticdeviation, 1,false);
		eu.saveResultWorkbook();
	}

}
