package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class PrimeNumber {

	static Scanner obj=null;
	
	static boolean isPrime=true;
	public static void main(String[] args)
	{
	
				System.out.println("Enter a Number");
				obj=new Scanner(System.in);
				int number=obj.nextInt();
				System.out.println("The number is: "+number);
				
				
				for(int i=2; i<number; i++)
				{
					if(number%i==0)
					{
						isPrime=false;
						break;
					}
				
					
				}
						
				if(isPrime==false)
				{
					System.out.println("Number is not Prime");
				}
				
				else if(number==1 || number==0)
				{
					System.out.println("Number is not Prime");
				}
				
				else if(isPrime==true)
				{
					System.out.println("Number is  Prime");
				}	
				
	}

}
