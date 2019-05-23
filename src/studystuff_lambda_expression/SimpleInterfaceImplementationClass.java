package studystuff_lambda_expression;

 interface SimpleInterface

{

	
	public void draw();
	
	
}



class SimpleInterfaceImplementationClass
{
	public static void main(String str[])
	{
		
		int width=10;
		SimpleInterface obj=new SimpleInterface() 
		{
			
			@Override
			public void draw() 
			{
				
				System.out.println("Drawing: "+width);
			}
		};
		obj.draw();
	}
}

