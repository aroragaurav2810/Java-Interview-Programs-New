package studystuff_interview_questions_data_structure;


import java.util.Scanner;

public class ImplementAQueueUsingAnArray

 {
	static int top=0;
	public static void main(String[] args) 
	
	{
			int ar[]=new int[5];
			for(int i=0;i<ar.length;i++)
			{
				System.out.println("Enter Element "+ ++top);
				Scanner obj=new Scanner(System.in);
				int value=obj.nextInt();
				System.out.println("Element "+ top  + " is "+ value );
				ar[i]=value;
			}
			System.out.println();
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
			
	}

}
