package studystuff_interview_questions_all;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SpecialForLoopWithDifferentCollections 

{

	static void specialForLoopWithList()
	{
		List<String> list=new ArrayList<String>();
		list.add("value1");
		list.add("value2");
		list.add("value3");
		list.add("value4");
		Collections.sort(list);
		for(String temp:list)
		{
				System.out.println(temp);
		}
	}
	
	
	static void specialForLoopWithSet()
	{
		Set<String> set=new LinkedHashSet<String>();
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		
		for(String temp:set)
		{
				System.out.println(temp);
		}
	}
	
	
	
	static void specialForLoopWithMap()
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("value1",1);
		map.put("value2",2);
		map.put("value3",3);
		map.put("value4",4);
		System.out.println("map values are "+ map.values());
		//Set  set=map.entrySet();
		for(Entry<String, Integer> entry:map.entrySet())
		{
				System.out.println(entry);
		}
	}
	
	
	public static void main(String[] args) 
	
	{
		specialForLoopWithList();
		specialForLoopWithSet();
		specialForLoopWithMap();
	}

}
