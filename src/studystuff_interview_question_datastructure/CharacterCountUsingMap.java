package studystuff_interview_question_datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CharacterCountUsingMap 

{
	
	static String str="Gaurav Kumar Arora";
	static String str2;
	// A=1, a=4, r=3, u=2, v=1, g=1, o=1
	static List<Object> list=new ArrayList<>();
	static Map<Character, Integer> map=new HashMap<>();
	Iterator<Object> iterator_obj=list.iterator();
	static int count=1;
	public static void main(String[] args) 
	
	{
	
		str2=str.replaceAll("\\s+", "");
		
		System.out.println(str2);
		for(int i=0;i<str2.length();i++)
		{
			
			System.out.println(map.get(str2.charAt(i)));
		if(map.containsKey(str2.charAt(i)))
		{
			map.put( str2.charAt(i), map.get(str2.charAt(i))+1);
			
		}
		else
		{
			map.put( str2.charAt(i), count);
		}
		}
		
		System.out.println(map);
		
	}

}

//both character count programs done with same logic