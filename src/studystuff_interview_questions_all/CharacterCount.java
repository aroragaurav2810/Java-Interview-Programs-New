package studystuff_interview_questions_all;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



public class CharacterCount {

	public static void main(String[] args) 
	
	{
			String str_existing="gaurav arora";
			String str=str_existing.replace(" ", "");
			Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
			int count=1;
			for(int i=0;i<str.length();i++)
			{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i),count);
			}
			}
			System.out.println(map);
	}

}
