package studystuff_interview_questions_all;

public class Operator_Example_2 
{

	
	static boolean b=false;
	static int a;
	
	
	public static void main(String[] args) 
	
	{
			
		// primitive data type in if condition 
		
		/*if(a=3)	
		{
			System.out.println("InValid code statement");
		}*/
		
		if(a==3)	
		{
			System.out.println("Valid code statement1");
		}
		
		// NOTE: SCJP: In both code, you can see, In if condition, we can not keep assignment operator, only comparator operator 
		// can be used but if user using assignment operator with boolean operand then it is allowed 
		// otherwise means with other type operand(except boolean), application throws compilation error
		
		
		// boolean type in if condition
		if(b=true)
		{ 
			System.out.println("Valid code statement2");
		}
		
		if(b==true)
		{
			System.out.println("Valid code statement3");
		}

		}

	}


