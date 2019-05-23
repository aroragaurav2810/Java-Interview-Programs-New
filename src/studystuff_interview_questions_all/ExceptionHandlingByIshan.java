package studystuff_interview_questions_all;

import java.util.Scanner;

public class ExceptionHandlingByIshan {
	
	long adhaar;
	//Scanner obj = new Scanner(System.in);
	static ExceptionHandlingByIshan obj1 = new ExceptionHandlingByIshan();
	
	void InputAdhaar()
	{
		
		try {
			Scanner obj = new Scanner(System.in);
			System.out.println("Please enter your adhaar number");
			adhaar= obj.nextLong();
			obj1.Validation();
			}
		catch (Exception obj2)
		{
			
			System.out.println("Please enter valid Adhaar Number only");
		    InputAdhaar();
		}
	}
	
	void Validation()
	{
		int length = (int) Math.log10(adhaar) + 1;  //this keyword will store the value of number of digits in variable adhaar
		//System.out.println(length);
		
		if (length == 12)
		{
			System.out.println("Thank you for entering adhaar number");
		}
		else if(adhaar<=0 )
		{
			System.out.println("You have entered negative or 0 range value");
			InputAdhaar();
			
		}
		else if(length<12)
		{
			System.out.println("You have entered " + length + " digits, Please enter 12 digits of your adhaar number");
			InputAdhaar();
			
		}
	
		
	}

	public static void main(String[] args)
	
	{
		obj1.InputAdhaar();
		
	}
}
