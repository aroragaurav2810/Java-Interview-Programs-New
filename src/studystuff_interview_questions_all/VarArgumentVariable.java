package studystuff_interview_questions_all;

public class VarArgumentVariable

{

	// We can have only one var-argument variable in a method call
	// Var-argument should be the last variable in function parameters
	// Function with Var argument variables should not be overloaded because they cause doubt while calling methods hence compilation error comes 
	// NOTE: Var argument variables works as array in function parameter
	// The another name for var argument variable is ellipsee
	
	
	
	public void function1(int a, int...b)
	{
		System.out.println(a+" "+ b[0]+" "+b[1]+" "+b[2]);
	}
	
	public static void main(String[] args) 
	
	{
		VarArgumentVariable obj=new VarArgumentVariable();
		obj.function1(10, 20,30,40);

	}

}
