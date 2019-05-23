package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class AddFirstNNumbers 


{

	static int sum=0;
	
	public static void main(String[] args) 
	
	{
			System.out.println("Enter total numbers");
			Scanner obj=new Scanner(System.in);
			int number=obj.nextInt();
			System.out.println("Total count is "+number);
			for(int i=1;i<=number;i++)
			{
				sum=sum+i;
			}
System.out.println("The sum of "+number+" is "+ sum );
	}

}


// This logic is created by me, In tutorial point(SCJP folder book mark: Java Data Structure - Programming Examples)
// which is quite complex