package studystuff_geeksforgeeks_algorithm;

import java.util.Scanner;

public class LinearSearchWithMultiThreading implements Runnable
{
	
	
	
	

		private boolean flag;
		private String threadName;
		private int arr[]={10,50,30,70,80,60,20,90,40};
		private int key=230;
		
	
		public LinearSearchWithMultiThreading(String threadName) 
		{
			this.threadName=threadName;
		}
		
		
		@Override
		public void run() 
		{
			for(int i = 0; i<arr.length; i++) 
			{
				if(key == arr[i]) 
				{
					System.out.println("Search is successful by " + threadName);
					flag = true;
					break;
				}
			}
				if(flag == false) 
				{
				System.out.println("Search is unsuccessful by " + threadName);
				}
		}
		
		public static void main(String[] args)
		{	
			Thread thread1 = new Thread(new LinearSearchWithMultiThreading("Thread 1"));
			thread1.start();
			
			Thread thread2 = new Thread(new LinearSearchWithMultiThreading("thread 2"));
			thread2.start();
			
		}
	}


