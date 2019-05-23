package studystuff_lambda_expression;


interface LambdaExpressionWithMultipleStatement
{  

	
	String say(String message);  


}  



public class LambdaExpressionWithMultipleStatementImplementationClass 
{

	public static void main(String[] args)
	
	
	{
		LambdaExpressionWithMultipleStatement obj1=str->
		{
		String str1="gaurav ";
		String str2=str1+str;
		return str2;
		};
		System.out.println(obj1.say("arora"));
	}

}
