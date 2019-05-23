package studystuff_geeksforgeeks_multithreading;

    // MultiThreading: As name referes, concurrent execution of threads(part of program)
	// where Thread is a part of program
	// Thread can be created by using two mechanisms:
	// 1. extending the Thread Class and
	// 2. Implementing the Runnable Interface

// A multi-threaded program contains two or more parts that can run concurrently. 
// where Each part of such a program is called a thread, and each thread defines a separate path of execution.

	
// Let's see an example of class extending a Thread class

public class MultiThreadingInJavaByExtendingThreadClass 
{
	public static void main(String[] args) 
	{
		int n=8;
		for(int i=0;i<=n;i++)
		{
			ClassExtendingThreadClass obj=new ClassExtendingThreadClass();
			obj.start();
		}
	}

}


// We create a class that extends the java.lang.Thread class. 
// This class overrides the run() method available in the Thread class. 
// A thread begins its life inside run() method. We create an object of our new class and 
// call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.

class ClassExtendingThreadClass extends Thread
{
	
// Why do we need to override run() method. because A thread begins its life inside run() method	
	public void run()
	{
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
	}
}



