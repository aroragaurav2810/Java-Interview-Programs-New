package studystuff_reflection_and_generic_enum_database;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public enum TestEnum 

{
	
	// enum in java:
	// A Java enum is a special Java type used to define collections of constants. 
	// More precisely, a Java enum type is a special kind of Java class. An enum can contain constants, methods etc
	// enums are implicitly final subclasses of java.lang.Enum
	// toString may be overridden to provide any content in enum
	// enum being used as singleton class-i.e.ompany side contains private constructor because new can never be used with an enum
	// if an enum is a member of a class, it's implicitly static. 
	
	
	
	
	
	// this constant of enum will act as the object to call a function getQueryAsString() because new can never be used with an enum
	//EmployeeTable;
	// this constant of enum can be created as constant like "EmployeeTable;"
	//EmployeeTable();
	// this constant of enum can be created as an object that calls the constructor without parameter like "EmployeeTable();"
	EmployeeTable("Employee.sql"),
	StudentTable("Student.sql");
	// this constant of enum can be created as an object that calls the constructor with parameter like "EmployeeTable("Employee.sql");"
	
	
	String queryfilename;
	
	
	// enum being used as singleton class-i.e. contains private constructor
	private TestEnum(String sqlfilename)
	{
		queryfilename=sqlfilename;
	}
	
	
	
	public String getQueryAsString() throws IOException{
		File queryFile = new File (System.getProperty("user.dir") + "//src//studystuff_reflection_and_generic_enum_database_resources//"+queryfilename);
		 String query=FileUtils.readFileToString(queryFile);
		 return query;
	}
	
}
