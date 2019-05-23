package studystuff_memory_management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SpecialForLoopWithMap

{

	public static void main(String str[])
	{
		List<Object> list=new   ArrayList<>();
		Map<Object,Object> map=new HashMap<>();
		map.put(10, null);
		map.put(10.5, true);
		map.put("10", 10.5);
		map.put('1', "null");
		Set set=map.keySet();
		System.out.println("Convert Map- By Using Set");
		for(Object temp:set)
		{
			System.out.println(temp);
			System.out.println(map.get(temp));
		}
	System.out.println("Convert Map- By Using Entry Class");
	for(Entry<Object, Object> temp2:map.entrySet())
	{
		System.out.println(temp2);
	}
	}
	
}
