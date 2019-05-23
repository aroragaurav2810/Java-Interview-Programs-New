package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class ReverseAStringUsingStackByArray 

{
	static int top=0;
	public static void main(String[] args) 
	
	{
			String ar[]=new String[5];
			for(int i=0;i<ar.length;i++)
			{
				System.out.println("Enter Element "+ ++top);
				Scanner obj=new Scanner(System.in);
				String value=obj.next();
				System.out.println("Element "+ top  + " is "+ value );
				ar[i]=value;
			}
			System.out.println();
			for(int i=ar.length-1; i>=0;i--)
			{
				System.out.println(ar[i]);
			}
			
	}

}