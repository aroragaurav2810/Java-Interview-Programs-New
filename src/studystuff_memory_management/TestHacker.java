package studystuff_memory_management;

import java.util.*;

public class TestHacker 

{

	public static void main(String[] args) 
	{
				
		try
		{
		        System.out.println("Hello World!");
		        Scanner br=new Scanner(System.in);
				Scanner br1=new Scanner(System.in);
		        int t = br.nextInt();
				int a[] = new int[t];
				StringTokenizer st = new StringTokenizer(br1.nextLine());
				br.close();
				br1.close();
				int i = 0;
				while(st.hasMoreTokens()){
					a[i++] = Integer.parseInt(st.nextToken());
				}
		        
		        for (int j = 0; j < t; ++j) {
		            int num = a[j];
		            for (int k = 1; k <= num; ++k) {
		                if (k % 15 == 0)
		                    System.out.println("FizzBuzz");
		                else if (k % 3 == 0)
		                    System.out.println("Fizz");
		                else if (k % 5 == 0)
		                    System.out.println("Buzz");
		                else
		                    System.out.println(k);
		            }   
		        }
		}
		catch(Exception e)
		{
		     System.out.println(e);
		}
		
		

	}

}
