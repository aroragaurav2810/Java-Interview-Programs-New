package studystuff_interview_questions_all;


import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class WorkerThread implements Runnable

{
	private String message;
	public WorkerThread(String message)
	{
		this.message=message;
	}
	
	public void processMessage() 	
	{
		try
		{
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	public void run() 
	{
		System.out.println("Start Message "+Thread.currentThread().getName()+"Start Message"+message);
		processMessage();
		System.out.println("End Message "+Thread.currentThread().getName()+"End Message "+message);
		
	}

}
