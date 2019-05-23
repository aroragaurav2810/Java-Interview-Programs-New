package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class FibonacciSeries 



{
	static int n;
	static int a=0;
	static int b=1;
	static int c=0;
	public static void main(String[] args)
	{
	
		System.out.println("Enter a number to get its fibonnacci series");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();

		System.out.print(a);
		System.out.print("\t"+b);
		
		for(int i=2; i<=n;i++)
		{
			
			
			c=a+b;

			System.out.print("\t"+c);	
			a=b;
			b=c;
		}
		
		
	}

}
