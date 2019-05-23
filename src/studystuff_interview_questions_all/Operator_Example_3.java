package studystuff_interview_questions_all;

public class Operator_Example_3 


{

	static double x=40d;
	static double y=20d;
	static String str="gaurav";
	
	
	public static void main(String[] args) 
	
	{
			
		System.out.println(str+x+y);  // without parenthesis, if any string is associated the no sum would calculate, only concatenation would happen
		System.out.println(str + (x + y));   // by applying paranthesis, we can get the sum

	}

}
