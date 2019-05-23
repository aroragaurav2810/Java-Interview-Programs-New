package studystuff_memory_management;

import java.util.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestHackerGaurav 

{

	public static void main(String[] args) 
	{
				
		try
		{
		        
		        Scanner br=new Scanner(System.in);
				
		        int no=br.nextInt();
		        for(int i=1;i<=no;i++)
		        {
		        	
		        		if(i%3==0 && i%5==0)
			        	{
			        		System.out.println("FizzBuzz");
			        	}
			        	else if(i%3==0)
			        	{
			        		System.out.println("Fizz");
			        	}
			        	else if(i%5==0)
			        	{
			        		System.out.println("Buzz");
			        	}
			        	else
			        	{
			        		System.out.println(i);
			        	}
		        	
		        }
		        
		}
		catch(Exception e)
		{
		     System.out.println(e);
		}
		
		

	}

}
