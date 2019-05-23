package studystuff_interview_questions_all;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.collections.map.HashedMap;

public class CharacterCountInString 

{
	static int count=1; 
	static String str=null;
	static Scanner obj=null;
	static char []characters_array=null;
	static Map<Character, Integer> map=new HashMap<>();
	public static void main(String[] args) 
	
	{
			System.out.println("Enter the string");
			obj=new Scanner(System.in);
			str=obj.next();
			characters_array=new char[str.length()];
			for(int i=0;i<str.length();i++)
			{
				System.out.println(str.charAt(i));
				characters_array[i]=str.charAt(i);
			}
			
			System.out.println(characters_array);
			
			for(int i=0;i<characters_array.length;i++)
			{
				if(map.containsKey(characters_array[i]))
				{
					
					map.put(characters_array[i], map.get(characters_array[i])+1);
					
				}
				
				else
				{
				map.put(characters_array[i], count);
				}
				
			}
			System.out.println(map);
			
			
		

	}

}

//both character count programs done with same logic