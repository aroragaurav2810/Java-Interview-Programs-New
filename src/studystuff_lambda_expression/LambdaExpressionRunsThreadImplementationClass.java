package studystuff_lambda_expression;

public class LambdaExpressionRunsThreadImplementationClass


{

	public static void main(String[] args) 
	
	
	{
			Runnable r1=()->
			{
				System.out.println("Thread 1 is running");
			};
			Thread t1=new Thread(r1);
			t1.start();
	}

	

	
	

}
