package studystuff_interview_questions_all;

public class Increment_And_Decrement_Operator_2 

{
	
	static int x=2;
	static int y=3;
	

	public static void main(String[] args) 
	
	
	{
			if(x<y | ++x>y++)  // This gives true in LHS, it means this OR operator will proceed under if and it also checks for RHS as here we have used bitwise OR operator not the Logical OR operator
			{
				System.out.println("value of x is "+x);
				System.out.println("value of y is "+y);
			}

	}

}


//very important question in terms of certification

/*Difference between Logical OR(||) and Bitwise OR(|) operator.

The difference is not of much use but In case of increment or decrement operator, it turns the complete output of the increment/decrement operator program

NOTE: Answer is: The difference in both operator is that in logical operator(||), If the LHS expression gives true then 

expression does not bother about the RHS expression but in case of bitwise operator(|), even if the LHS expression returns true
 
but still the expression checks for RHS expression.

In the given Question of increment and decrement operator, I have talked about the role of bitwise and logical operator 

because here, if instead of bitwise operator there would be logical operator then the answer would have been  different x=2, y=3, 

see exact question in project interview question, file: Increment_And_Decrement_Operator_2*/