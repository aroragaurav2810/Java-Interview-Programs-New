package studystuff_interview_questions_all;

public class Overloading_Example 

{

	public void function1(int x)       // overloaded function, father
	{
		System.out.println("integer "+x);
	}

	public void function1(byte x)   // overloading function, child
	{
		System.out.println("byte "+x);
	}
	
	public static void main(String[] args)
	
	
	{
			Overloading_Example obj=new Overloading_Example();
			obj.function1(10);   // firstly, father would be invoked

	}

}
