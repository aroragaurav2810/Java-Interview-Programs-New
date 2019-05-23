package studystuff_javareflection;





import java.lang.reflect.Method;

import studystuff_interview_questions_all.Excel_Read_Write_Functionality;
import studystuff_reflection_and_generic_enum_database.Student;

public class GetMethodsOfClass

{

	public static void main(String[] args) 
	
	{
		Method methodarray[]=Excel_Read_Write_Functionality.class.getMethods();
		
		for(Method method:methodarray)
		{
			System.out.println("Student class methods name is: "+ method.getName());
		}

	}

}
