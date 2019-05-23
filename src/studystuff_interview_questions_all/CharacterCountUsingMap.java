package studystuff_interview_questions_all;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CharacterCountUsingMap 

{

	public static void main(String[] args) 
	
	
	{
	
				String str;
				System.out.println("Enter String of your choice ");
				Scanner obj=new Scanner(System.in);
				str=obj.nextLine();
				System.out.println("Your String is "+str);
				int count = 1;
				HashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
				for(int i=0; i<str.length();i++)// gauravarora
				{
					
					if(map.containsKey(str.charAt(i)))
					{
						map.put(str.charAt(i), map.get(str.charAt(i))+1);
					}
					else
					{
					map.put(str.charAt(i), count);
					}
				}
				
				System.out.println(map);
				
				
	}

}
