package studystuff_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



//As we know, java collections are fail-fast in nature because they throw ConcurrentModificationException
//which comes when you try to parallely/concurrently/simultaneously updating/modifying and then using a map
//or any collection.
	
//Thus, to give a solution to such exception, java has array or 
//a collection class over list collection called as CopyOnWriteArrayList or
//a collection class over hash map collection called as ConcurrentHashMap.	

// NOTE: Unlike HashMap class, This ConcurrentHashMap class does not store Null Key or Null Value


public class ConcurrentHashMapClass 

{

	public static void main(String[] args) 
	
	{
		Map<Object, Object> map=new ConcurrentHashMap<Object, Object>();
		map.put(10, "Gaurav");
		map.put(20, "Geeta");
		map.put(30, "Kamiya");
		map.put(30, "Kailash");
		map.put(40, "Gautam");
		//map.put(50, null);
			
		//Set<Object> set=new HashSet<>();
		for(Map.Entry<Object, Object> entry:map.entrySet())
		{
			if(entry.getKey().equals(10))
			{
				map.remove(entry.getKey());
			}
		}
		System.out.println("map is: "+map);
	}

}
