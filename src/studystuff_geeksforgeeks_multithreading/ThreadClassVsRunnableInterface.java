package studystuff_geeksforgeeks_multithreading;

public class ThreadClassVsRunnableInterface 

{

	// 1. If we extend the Thread class, our class cannot extend any other class because 
	// Java doesn�t support multiple inheritance. But, if we implement the Runnable interface, 
	// our class can still extend other base classes.

	// 2. We can achieve basic functionality of a thread by extending Thread class because 
	// it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
	


}
