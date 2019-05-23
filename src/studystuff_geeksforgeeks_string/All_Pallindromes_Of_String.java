package studystuff_geeksforgeeks_string;

import java.util.Scanner;

public class All_Pallindromes_Of_String 

{

	static String str="abbaabba";
	static boolean is_pallindrome;
	
	public static boolean checkPallindrome(StringBuffer str)
	{
		
		String str_reverse=str.reverse().toString();
		// here in above statement str value becomes reversed as it is mutable thus in below statement again applied it reverse to check pallindrome or not
		if(str.reverse().toString().equalsIgnoreCase(str_reverse))
		{
			is_pallindrome= true; 
		}
		else
		{
			is_pallindrome= false;
		}
		return is_pallindrome;
		// above is my logic
		/*for(int i=0;i<str.length()/2;i++)
		{
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
		}
            return true;*/
		// Commented the computer given logic
	}
	
	
	
	public static void getAllPallindromeOfString(String str)
	{
	
		for(int i=0;i<str.length();i++)   
		{
			for(int j=i;j<str.length();j++)
			{
			//	System.out.println("sub string is "+str.substring(i, j+1));
				if(checkPallindrome(new StringBuffer(str.substring(i, j+1))))
				{
					System.out.println(str.substring(i, j+1));
				}
			}
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	
	
	{
	All_Pallindromes_Of_String obj=new All_Pallindromes_Of_String();
	/*System.out.println("Enter a string, whose multiple/All pallindromes you want");
	Scanner obj1=new Scanner(System.in);
	str1=obj1.next();*/
	obj.getAllPallindromeOfString(str);
	}

}


// Self made program, It has become very easy on using string buffer logic instead of using commented logic in function checkPallindrome()


