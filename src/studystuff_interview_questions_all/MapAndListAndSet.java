package studystuff_interview_questions_all;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndListAndSet {

	public static void main(String[] args) 
	
	{
			
		
		
			
		
		//	Collection<Integer> obj2=new HashSet<Integer>();
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("A", 10);
			map.put("B", 20);
			map.put("C", 30);
			map.put("D", 40);

			
			
		// Traverse a Map with Iterator is not possible, Thus convert a map into set first and then traverse.	
			Set set=map.entrySet();
			Iterator itr=set.iterator();
			while(itr.hasNext())
			{
				System.out.println("check: "+itr.next());
			}
			
       // Map Traverse in different ways
			for(String str:map.keySet())
			{
				System.out.println("Key: "+str+" Value: "+map.get(str));
			}
			
			for(Map.Entry m:map.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  }  
			
			for(Entry<String, Integer> m:map.entrySet()){  
				   System.out.println(m.getKey()+" "+m.getValue());  
				  } 
			
			
// Difference in hashMap and HashTable
// Hashtable does not contain null key  and even it does not contain null value			
			HashMap<Integer, String> obj1=new HashMap<Integer, String>();
			obj1.put(10, "Abc");
			obj1.put(20, "CDE");
			//obj1.put("gaurav", "arora");
			//obj1.put(true, false);
			obj1.put(null, null);
			obj1.put(null, null);
			obj1.put(null, null);
			System.out.println(obj1);
			
			Hashtable<Integer,String> obj=new Hashtable<Integer,String>();
			obj.put(10, "Abc");
			obj.put(20, "CDE");
			//obj.put("gaurav", "arora");
			//obj.put(true, false);
			/*obj.put(40, null);
			obj.put(50, null);
			obj.put(null, null);*/
			
			System.out.println(obj);

	}

}

// 
