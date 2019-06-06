package studystuff_javareflection;





import java.lang.reflect.Method;

import studystuff_interview_questions_all.Excel_Read_Write_Functionality;


public class GetMethodsOfClass

{

	public static void main(String[] args) 
	
	{
		System.out.println("All methods of class and it's parent");
		
		Method methodarray[]=Excel_Read_Write_Functionality.class.getMethods();
		
		for(Method method:methodarray)
		{
			System.out.println("Student class methods name is: "+ method.getName());
		}

		System.out.println("Declared methods of class");
		
		Method declaredmethodarray[]=Excel_Read_Write_Functionality.class.getDeclaredMethods();
		
		for(Method method:declaredmethodarray)
		{
			System.out.println("Student class methods name is: "+ method.getName());
		}
		
	}

}
