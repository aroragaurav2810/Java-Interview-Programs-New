package studystuff_geeksforgeeks_multithreading;

public class LifeCycleAndStatesOfAThreadInJava implements Runnable 

{

	// A thread in Java at any point of time exists in any one of the following states. A thread lies only in one of the shown states at any instant:

		// 1. New
		// 2. Runnable
		// 3. Blocked
		// 4. Waiting
		// 5. Timed Waiting
		// 6. Terminated
	
	public static void main(String[] args) throws Exception 
	{
		Thread thread_obj=new Thread(new LifeCycleAndStatesOfAThreadInJava());
		System.out.println("State of thread_obj is: "+thread_obj.getState());
		thread_obj.start();
		System.out.println("State of thread_obj is: "+thread_obj.getState());
		thread_obj.sleep(1500);
		System.out.println("State of thread_obj is: "+thread_obj.getState());
		
	}

	@Override
	public void run() 
	{
		Thread thread_obj2=new Thread(new StatesOfThread2());
		System.out.println("State of thread_obj2 is: "+thread_obj2.getState());
		thread_obj2.start();
		System.out.println("State of thread_obj2 is: "+thread_obj2.getState());
		try {
			thread_obj2.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State of thread_obj2 is: "+thread_obj2.getState());
		try {
			thread_obj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("State of thread_obj2 is: "+thread_obj2.getState());
		
	}

}




class StatesOfThread2 implements Runnable
{
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

