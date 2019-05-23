package studystuff_interview_questions_all;

import com.steadystate.css.util.ThrowCssExceptionErrorHandler;

public class CustomExceptionExample extends Exception

{
	void checkAge(int age) throws CustomExceptionExample 
	{
		if(age>=18)
		{
			System.out.println("Welcome to vote");
		}
		else
		{
			throw new CustomExceptionExample();
		}
	}

	public String toString()
	{
		return "You are not eligible for vote because your age is less than 18";
		
	}
	public static void main(String[] args) 
	{
			CustomExceptionExample obj=new CustomExceptionExample();
			try
			{
			obj.checkAge(13);
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			} 
	}

}
