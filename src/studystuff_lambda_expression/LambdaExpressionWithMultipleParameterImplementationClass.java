package studystuff_lambda_expression;

interface LambdaExpressionWithMultipleParameter
{
	public int add(int a, int b);
}



public class LambdaExpressionWithMultipleParameterImplementationClass 

{

	static int width=10;
	public static void main(String str[])
	{
		
		
		LambdaExpressionWithMultipleParameter obj=( a,  b)->(a+b);
		System.out.println(obj.add(10, 20));
	
		LambdaExpressionWithMultipleParameter obj1=(int a, int b)->(a+b);
		System.out.println(obj1.add(10, 20));
	
	}
	
}
