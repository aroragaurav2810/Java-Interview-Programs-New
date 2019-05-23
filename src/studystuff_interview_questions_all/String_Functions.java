package studystuff_interview_questions_all;

import java.util.Scanner;

public class String_Functions 

{

	public static void main(String[] args)
	
	{
	
			String str, str1, str2 = "";
			System.out.println("Enter a String for performing task on it");
			Scanner obj=new Scanner(System.in);
			str=obj.nextLine();
			str1=obj.nextLine();
			// length oof string is
			System.out.println("Length of string is "+str.length());
			
			// Character of String at particular Index
			System.out.println("Character of String at particular Index is"+ str.charAt(0));
			
			// Substring of a String is: using both start/begin index and end index 
			System.out.println("Substring of a String is"+ str.substring(0, 5));
			
			// Substring of a String is: using only one index i.e start/begin index
			System.out.println("Substring of a String is"+ str.substring(6));
		
			// 
			System.out.println("comparision of two strings are"+ str1.compareTo(str2));
	}

}
