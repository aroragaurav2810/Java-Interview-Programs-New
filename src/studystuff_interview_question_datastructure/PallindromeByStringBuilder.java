package studystuff_interview_question_datastructure;

import java.util.Scanner;

public class PallindromeByStringBuilder {

	
	
	static String str1,str2;
	
	static StringBuilder str;
	public static void main(String[] args) 
	
	
	{
		
		
		
		System.out.println("Enter a string for pallindrome check");
		Scanner obj=new Scanner(System.in);
		str1=obj.next();
		str=new StringBuilder(str1);
		str2=str.reverse().toString();
		System.out.println(str1);
		System.out.println(str);
		if(str2.equalsIgnoreCase(str1))
		{
			
			System.out.println("String is pallindrome");
		}
		else
		{
			
			System.out.println("String is not pallindrome");
		}
		
	}

}
