package studystuff_geeksforgeeks_multithreading;

    // MultiThreading: As name referes, concurrent execution of threads(part of program)
	// where Thread is a part of program
	// Thread can be created by using two mechanisms:
	// 1. extending the Thread Class and
	// 2. Implementing the Runnable Interface
	
	
	// Let's see an example of class Implementing the Runnable Interface

public class MultiThreadingInJavaByImplementingRunnableInterface 
{
	public static void main(String[] args) 
	{
		int n=8;
		for(int i=0;i<=n;i++)
		{
			Thread obj=new Thread(new ClassImplementingRunnableInterface());
			obj.start();
		}
	}

}


// We create a class that implements the java.lang.Runnable 
// This class implements the run() method available in the Runnable interface. 
// A thread begins its life inside run() method. We create an object of our Thread class(associated with class who implemented Runnable interface) and 
// call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.

class ClassImplementingRunnableInterface implements Runnable
{
	
// Why do we need to override run() method. because A thread begins its life inside run() method	
	public void run()
	{
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}



