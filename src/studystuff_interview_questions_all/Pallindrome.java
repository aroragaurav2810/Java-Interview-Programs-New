package studystuff_interview_questions_all;

import java.util.Scanner;

public class Pallindrome {

	
	static Scanner obj=null;
	static String str1;
	static String str2="";
	
	public static void main(String[] args) 
	
	{
	
		
		
		System.out.println("Enter a String for pallindrom check");
		obj=new Scanner(System.in);
		str1=obj.next();
		for(int i=str1.length()-1; i>=0; i--)
		{
			System.out.print("\t"+str1.charAt(i));
			str2=str2+str1.charAt(i);
		}
		System.out.println();
		System.out.println(str1);
		System.out.println(str2);
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
