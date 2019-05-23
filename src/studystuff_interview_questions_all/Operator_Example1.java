package studystuff_interview_questions_all;

public class Operator_Example1 

{

	static int x=10;
	static int y=10;
	static int z=10;
	static char c='m';
	
	
	public static void main(String[] args) 
	
	{
		x=x+2*5;
		System.out.println(x);

		z=z*2+5;
		System.out.println(z);
		
		
		y=y+2*5-3;
		System.out.println(y);
	
	
	if(c<='l')
	{
		System.out.println("gaurav");
	}
	
	
	
	

}

}


// NOTE: Output of x is 20 instead of 60 because, java also uses bodmas logic
// NOTE: Output of y is 17 because, java also uses bodmas logic means firstly multiply, addition and subtraction
// NOTE: Bodmas Rule: When doing addition and subtraction it is best to go left to right.