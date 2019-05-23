package studystuff_interview_question_datastructure;

import java.io.IOException;

public class MutableAndImmutable {
	
	
	 void function1()
	{
		
	}

	public static void main(String[] args) throws NullPointerException
	
	{
		String str="Sachin";
		str.concat("tendulkar");
		System.out.println("String is immutable in nature "+str);
		
		StringBuilder str2=new StringBuilder("gaurav");
		str2.append("arora");
		System.out.println("String Builder is mutable in nature "+str2);
		try
		{
			System.out.println(str.charAt(10));
			System.out.println(str.charAt(5));
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("finally block");
		}
		MutableAndImmutable obj=new MutableAndImmutable();
		
		obj.function1();
		
		}

}

// example that also showing try block with multiple catch block 
