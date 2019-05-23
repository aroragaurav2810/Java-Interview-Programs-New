package studystuff_lambda_expression;

interface LambdaExpressionWithParametersAndReturnTypeAsFunctionalInterface
{
	public String draw(String str);
}

public class LambdaExpressionWithParameterImplementationClass

{

	public static void main(String[] args) 
	
	{
			int width=10;
			// first way:
			// you can even omit the function parenthesis as well as remove the return type 
			LambdaExpressionWithParametersAndReturnTypeAsFunctionalInterface obj=(String name)-> 
			{
				
				System.out.println("Drawing: "+width);
				System.out.println("name is: "+name);
				return "Check Drawing";
			};
			obj.draw("gaurav");

	// second way: without return type
			
			LambdaExpressionWithParametersAndReturnTypeAsFunctionalInterface obj1=(name)-> 
			{
				
				System.out.println("Drawing: "+width);
				System.out.println("name is: "+name);
				return "Check Drawing";
			};
			obj1.draw("gaurav");
			
		// third way:	
			LambdaExpressionWithParametersAndReturnTypeAsFunctionalInterface obj2=name-> 
			{
				
				System.out.println("Drawing: "+width);
				System.out.println("name is: "+name);
				return "Check Drawing";
			};
			obj2.draw("gaurav");
	}

}
