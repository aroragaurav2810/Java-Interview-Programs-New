package studystuff_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.commons.collections.map.HashedMap;

public class About_List_Map_Set

{
	
	// Collection is a framework:
		
		
	
	// Difference between Map and List
	// List always contains one argument(i.e an object of any type) whereas 
	// Map always contains argument in the form of key and value 

	
	// List can take duplicate values but 
	// map takes only unique key, however you can add duplicate key but while printing it overrides the existing key and its value

	
	// Map: Syntax:    Map<Key, Value> obj=new HashMap<key, Value>();
	// List Syntax:    List<Integer> obj=new ArrayList<Integer>();

	// Difference between List and Set:
	// List can contain duplicate elements whereas
	// Set contains unique elements only. however you can add duplicate value
	// but while printing it overrides the existing value

	// Difference between HashMap and LinkedHashMap and TreeMap
	// both are same, the only difference is HashMap does not maintain ordering and LinkedHashMap maintains ordering(in which entry is added)
	// look at below example, to find the difference between HashMap and LinkedHashMap
	// TreeMap also maintains ordering but alphabetically ordering
	// TreeMap does not contain null key however null value(even multiple null values are allowed) 
	
	
	// HashMap class extends AbstractMap class that implements Map interface
	// LinkedHashMap class extends HashMap class that extends AbstractMap class that implements Map interface
	// TreeMap extends NavigableMap class that extends SortedMap class that implements Map interface
	
	
	// Difference between HashSet and LinkedHashSet
	// both are same, the only difference is HashSet does not maintain ordering and LinkedHashSet maintains ordering
	// look at below example, to find the difference between HashSet and LinkedHashSet
		
	
	public static void main(String []str)
	{
	
	// About Map:
	// contains argument in key and value form, also called as entry
	// contains only unique element(key), however adding unique element/key(many times) does not matter
	// Map does not maintain ordering, see output for more reference
	// map contains only one null key and multiple null values, however adding null keys(many times) does not matter because at last the last one will overwrite
		
	Map<String, String> obj=new HashMap<String, String>();
	
	
	obj.put("gaurav", "1001");// stmt 1
	obj.put("kamiya", "1002");// stmt 2 
	obj.put("gaurav", "1004");// stmt 3 // overwriting as key in stmt 3 is same as stmt 1
	obj.put("kailash", "1002"); // stmt 4// not overwriting even value in stmt 3 is same as stmt 2 but key is different
	obj.put(null, null);
	obj.put(null, null);  // map contains only one null key because the last will overwrite the earlier null keys, however adding multiple null is allowed
	obj.put("geeta", null);  // it shows that map contains multiple mull value
	System.out.println("checking HasMap is "+obj);
	// HashMap does not maintain ordering, see output 
	
	Map<Object, String> obj_obj=new LinkedHashMap<Object, String>();
	obj_obj.put(10, "1001");
	obj_obj.put(2, "1002"); 
	obj_obj.put(3, "1004");
	obj_obj.put(4, "1002");
	obj_obj.put("gaurav", null);
	obj_obj.put(null, "Hello");  
	obj_obj.put(6, null); 
	obj_obj.put("gaurav", "Ishan");
	System.out.println("checking LinkedHashMap with integer is "+obj_obj);

	// LinkedHashMap maintains ordering(in which entry/object/element is inserted), see ouptput 
	
	
	Map<Object, Object> obj_obj_1=new TreeMap<Object, Object>();
	obj_obj_1.put(10, "1001");
	obj_obj_1.put(2, "1002"); 
	obj_obj_1.put(3, "1004");
	obj_obj_1.put(4, "1002");
	obj_obj_1.put(70, false);
	//obj_obj_1.put(null, "Hello");  
	obj_obj_1.put(6, null); 
	System.out.println(obj_obj_1.get(100));
	System.out.println("checking TreeMap with integer is "+obj_obj_1);
	// LinkedHashMap maintains ordering(in which entry/object/element is inserted), see ouptput 
	Set set=obj_obj_1.entrySet();
	Object []ar=set.toArray();
	System.out.println("converted value check "+ar[3]);
	Map<String, String> obj_obj_obj=new TreeMap<String, String>();
	obj_obj_obj.put("gaurav", "1001");
	obj_obj_obj.put("kamiya", "1002"); 
	obj_obj_obj.put("raper", "1004");
	obj_obj_obj.put("kailash", "1002");
	//obj_obj_obj.put(null, null);  
	//obj_obj_obj.put(null, null);
	obj_obj_obj.put("geeta", null);
	obj_obj_obj.put("amit", null);
	System.out.println("Tree Map is "+obj_obj_obj);
	
	
	
	// TreeMap maintains alphabatic/ascending ordering, see output
	// TreeMap does not contain null key however null value(even multiple null values are allowed)
	
	
	// About Set:
	// contains only one argument
	// contains only unique element, however adding unique element(many times) does not matter
	// Set does not maintain ordering, see output for more reference
	// Set contains only one null value however adding null values(many times) does not matter because at last the last one will overwrite
	
	Set<String> obj1=new HashSet<String>();
	obj1.add("value1");
	obj1.add("value2");
	obj1.add("value1");
	obj1.add("value3");
	obj1.add("value4");
	obj1.add("value5");
	obj1.add(null);
	obj1.add(null);  // set contains only one null value because the last will overwrite the earlier null values, however adding multiple null is allowed
	System.out.println("HashSet is "+obj1);
	// HashSet does not maintain ordering
	
	Set<String> obj1_obj1=new LinkedHashSet<String>();
	obj1_obj1.add("value1");
	obj1_obj1.add("value2");
	obj1_obj1.add("value1");
	obj1_obj1.add("value3");
	obj1_obj1.add("value4");
	obj1_obj1.add("value5");
	obj1_obj1.add(null);
	obj1_obj1.add(null);  // set contains only one null value because the last will overwrite the earlier null values, however adding multiple null is allowed
	System.out.println("LinkedHashSet is "+obj1_obj1);
	// LinkedHashSet maintains ordering in which element/object is inserted 
	

	
	Set<String> obj1_obj2=new TreeSet<String>();
	obj1_obj2.add("value1");
	obj1_obj2.add("value2");
	obj1_obj2.add("value1");
	obj1_obj2.add("value3");
	obj1_obj2.add("value4");
	obj1_obj2.add("value5");
//	obj1_obj2.add(n
	
//	obj1_obj2.add(null);  // set contains only one null value because the last will overwrite the earlier null values, however adding multiple null is allowed
	Object[] ar1=obj1_obj1.toArray();
	System.out.println("Array Value  "+ar1[3]);
	System.out.println("Tree Set is "+obj1_obj2);
	// TreeSet maintains ordering but with alphabetically order.
	// TreeSet takes null but does not print null value
	
	
	
	
	// About List:
	// contains only one argument
	// contains and even prints duplicate elements also
	// List maintains ordering, see output for more reference
	// List contains multiple null values
	
	List<String> obj2=new ArrayList<String>();
	obj2.add(0,"value1");
	obj2.add("value2");
	obj2.add("value1");
	obj2.add("value3");
	obj2.add("value4");
	obj2.add("value5");
	obj2.add(null);
	obj2.add(null);  // set contains only one null value because the last will overwrite the earlier null values, however adding multiple null is allowed
	obj2.add(8,"value1");
	System.out.println("ArrayList is "+obj2);
	
	
	
	
	
	
	}

}

class Little_Golu
{
	
}


