package studystuff_interview_questions_all;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool 

{

	public static void main(String[] args) 
	
	{		
			
			// Creating a pool of 5 thtreads
			ExecutorService executor=Executors.newFixedThreadPool(5);
			for(int i=0; i<10; i++)
				
			{
			Runnable worker=new WorkerThread(""+i);
			// calling an execute menthod of ExecutorService Interface which calls the constructor of worker thread class
			executor.execute(worker);
			}
			executor.shutdown();
			while(!executor.isTerminated())
			{
				
			}
			System.out.println("Finished all threads");
	}

}
