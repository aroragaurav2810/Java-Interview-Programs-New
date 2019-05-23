package studystuff_interview_questions_all;

import java.util.Scanner;





public class Program2 

{
	
	static Scanner obj=null;
	static String str1=null;
	static String[] str2=null;	
	public static void main(String[] args) 
	
	{
		obj=new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		str1=obj.nextLine();
		
		System.out.println("Existing String is: ");
		System.out.println(str1);
		str2=str1.split("\\s");
		
		System.out.print("Changed String is: ");
		System.out.println();
		for(int i=0; i<str2.length;i++)
		{
			System.out.print(str2[i]+" "+str2[i]+" ");
		}
		

	}

}
