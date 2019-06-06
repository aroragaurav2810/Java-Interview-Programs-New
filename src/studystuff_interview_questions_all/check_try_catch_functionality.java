package studystuff_interview_questions_all;

public class check_try_catch_functionality 

{
	static int a=10;
	static int b=0;
			
	public static void main(String[] args) 
	
	{
		try
		{
			System.out.println("Gaurav");	
			int c=a/b;
			System.out.println("Arora");
		}

		catch(ArithmeticException e)
		{
			System.out.println("Arithematic Exception: "+e);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception: "+e);
		}
		
		try
		{
			System.out.println("Arora after catch of exception");
			
		}
		catch(Exception e)
		{
			
		}
	}

}
