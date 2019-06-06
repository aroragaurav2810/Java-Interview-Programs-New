package studystuff_interview_questions_all;

public class Final_Keyword_Example 


{

	
	private final void function1()
	{
		final int a=10;
		
	}
	
	public  final void function2()
	{
		
	}
	
	protected final void function3()
	{
		
	}
	
	final void function4()
	{
		
	}
	
	public static void main(String[] args) 
	
	
	{
				

	}

}




class example extends Final_Keyword_Example
{
	
	public final void function1()
	{
		
	}
	 
	
	/*public final void function2()
	{
		
	}
	
	public final void function3()
	{
		
	}
	
	public final void function4()
	{
		
	}*/
}
	// Reason for commented function: Well Known: i.e. unable to override final method
	
	// Also a private method i.e. function1() can not be accessed in another class so overriding does not make any sense/impact on that hence
	// if user makes a function in another class with same name i.e function1() then there should not be any problem because, 
	// for another class it considers as its own function  

