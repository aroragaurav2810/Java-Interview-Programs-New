package studystuff_interview_questions_all;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Equals_Method_AND_Equals_Operator_enum


{
//  you can declare multiple enum in a class
//  enum in class are declared like this but external enum are something different . They are just similar to singleton class	
	
	
	
	enum Color{RED,BLUE} //; optional  
	static Color c1=Color.RED;
	static Color c2=Color.RED;
	
	enum Shape{RECTANGLE,SQUARE}
	Shape s1=Shape.RECTANGLE;
	Shape s2=Shape.SQUARE;
	
	public static void main(String[] args)
	
	{
		

		System.out.println(c1==c2);// It checks the content of two objects but not the location , reason below
		System.out.println(c1.equals(c2));  // It checks the content of two objects but not the location , reason below
	}

}


enum Pattern
{  

	Employee("Employee.sql");
	String queryfilename;
	private Pattern(String sqlfile)
	{
		 queryfilename=sqlfile;
	}
	
	
	public String getQueryAsString() throws IOException
	{
		File queryFile = new File (System.getProperty("user.dir") + "//src//studystuff_reflection_and_generic_enum_database_resources//"+queryfilename);
		return FileUtils.readFileToString(queryFile);
	}
	
	
}


// NOTE: In case of enum, everything is different in terms of equality, 
// here == operator and equals() method both sees the content not the memory location of object(This is because there is no object creation in enum while creating a reference)