package studystuff_memory_management;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

 

public class CharacterCountOfAString 
{

	public static void main(String[] args) 
	
	{
		int count=1;		
		String str_existing;
		String str;
		System.out.println("Please enter a String");
		Scanner obj=new  Scanner(System.in);
		str_existing= obj.nextLine();
		str=str_existing.replace(" ", "");
		Map<Object, Integer> map=new TreeMap<>();
		for(int i=0;i<str.length();i++)
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