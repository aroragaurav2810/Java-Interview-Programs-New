package study_stuff_exception;
public class MultiCallingFunctionMechanism 

{

		public MultiCallingFunctionMechanism example1()
		{
			System.out.println("Gaurav");
			return new MultiCallingFunctionMechanism();
		}
	
		public void example2()
		{
			System.out.println("Arora");
		}
	public static void main(String[] args) 
	
	{
	MultiCallingFunctionMechanism obj=new MultiCallingFunctionMechanism();
	obj.example1().example2();;

	}

}
