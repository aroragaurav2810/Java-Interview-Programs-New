package studystuff_lambda_expression;

import java.lang.reflect.WildcardType;

interface LambdaExpressionAsFunctionalInterface
{
	public void draw();
}

public class LambdaExpressionImplementationClass

{

	public static void main(String[] args) 
	
	{
			int width=10;
			LambdaExpressionAsFunctionalInterface obj=()-> 
			{
				
				System.out.println("Drawing:"+width);
			};
			obj.draw();
	}

}


 class LambdaExpressionImplementationClass2 implements LambdaExpressionAsFunctionalInterface

{
	static int width=10;
	public static void main(String[] args) 
	
	{
			
			LambdaExpressionAsFunctionalInterface obj=()-> 
			{
				
				System.out.println("Drawing:"+width);
			};
			obj.draw();
	}

	@Override
	public void draw() {
		System.out.println("Drawing2: "+width);
		
	}

}
