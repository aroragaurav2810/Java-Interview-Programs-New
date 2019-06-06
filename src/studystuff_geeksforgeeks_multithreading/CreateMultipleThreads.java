package studystuff_geeksforgeeks_multithreading;

public class CreateMultipleThreads 

{
		public static void main(String args[])
		{
			Thread thread=new Thread(new MyMultipleThreads());
			
		}
	
	
}





class MyMultipleThreads implements Runnable
{

	String name;
	 
	
	
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println();
		}
		
	}
	
}