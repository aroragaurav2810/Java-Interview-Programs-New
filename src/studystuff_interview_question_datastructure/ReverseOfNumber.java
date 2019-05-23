package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class ReverseOfNumber 


{

	static int quotient;
	static int remainder;
	static int sum;
	static int number;
	public static void main(String[] args) 
	{
		
		
				System.out.println("Enter a Number");
				Scanner obj=new Scanner(System.in);
				number=obj.nextInt();
				System.out.println("The number entered by user is: "+ number);
				
	/*while(quotient>0)
				{
					 quotient=number/10;
					 remainder=number%10;
					 sum=sum*10+remainder;
					 number=quotient;
			
				}*/
				
				
	// NOTE: We have used "do while" loop instead of while loop	because the universal accepted formulae says
	// that the value of quotient should always remains greater than zero which is possible only after 
	// dividing the entered number at least once that's why we use below logic 
		
			do
			{
					 quotient=number/10;
					 remainder=number%10;
					 sum=sum*10+remainder;
					 number=quotient;
			}while(quotient>0);
			System.out.println(sum);	
				
	}

}
