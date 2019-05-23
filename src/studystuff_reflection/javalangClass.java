package studystuff_reflection;

import java.lang.reflect.Method;

import org.apache.poi.ss.formula.functions.T;

public class javalangClass 

{
	
	// In Java Reflection, there is a class called as Class
	
	//The java.lang.Class class performs mainly two tasks:

	// 1. provides methods to get the metadata of a class at run time.
	// 2. provides methods to examine and change the run time behavior of a class.

	public static void main(String[] args) throws Exception 
	{
			
		// Create object of class "Class"
		
		// 1.  First way by .class syntax
		Class var=javalangClass.class;
		System.out.println("get class name by class Class object created by .class syntax "+var.getName());
		
		
		// 2. Second way by forName(String fullyQualifiedNameOfClass) method of class "Class"
		// fullyQualifiedNameOfClass: It means Class Name associating with package Name
		Class var2=Class.forName("studystuff_reflection.javalangClass");
		System.out.println("get class name by class Class object created by forName method "+var2.getName());
		
		
		// 3. Third way by getClass() method of class "Object"
		javalangClass jlc=new javalangClass();
		System.out.println("get class name by class Class object created by getClass method "+jlc.printClassName(jlc));	
		
		System.out.println("check class Type by class Class Object created by .class syntax "+jlc.checkTypeOfClass(var));	
		System.out.println("check class Type by class Class Object created by forName method "+jlc.checkTypeOfClass(var2));
		
		
	}
	
	public String printClassName(Object obj)
	{
	Class var3=obj.getClass();
	System.out.println("check class Type by class Class Object created by getClass method "+var3.isInterface());
	return var3.getName();
	
	}

	public boolean checkTypeOfClass(Class jobclass)
	{
		return jobclass.isInterface();
	}
	
}


class Simple
{
	
}


interface My
{
	
}
