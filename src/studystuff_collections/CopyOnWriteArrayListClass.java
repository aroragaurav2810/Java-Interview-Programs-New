package studystuff_collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass

{

// As we know, java collections are fail-fast in nature because they throw ConcurrentModificationException
// which comes when you try to parallely/concurrently/simultaneously updating/modifying and then using a list
// or any collection.
	
// Thus, to give a solution to such exception, java has array or 
// a collection class over list collection called as CopyOnWriteArrayList or
// a collection class over hash map collection called as ConcurrentHashMap.	


// NOTE: Unlike ConcurrentHashMap class, This CopyOnWriteArrayList class stores Null Value	
	
public void removeLeadingZerosFromString(String str1) 
	
	{
		System.out.println("Remove Leading Zeros from String");
		System.out.println("String is: "+str1);
		String str=str1;
		List<Character> characters_list=new CopyOnWriteArrayList<>();
		int i=0; 
		while(i!=str.length())
		{
			characters_list.add(str.charAt(i));
			i++;
		}
		
			
		
		for(Character character:characters_list)
		{
			if(character.compareTo('0')==0)
			{
				
				characters_list.remove(character);
			}
			else
			{
				break;
			}
		}
		System.out.println(characters_list);	
	}
	
	public void modifyCopyOnWriteArrayList()
	{
	
		List<String> characters_list=new CopyOnWriteArrayList<>();
		characters_list.add("Gaurav");
		characters_list.add("Gautam");
		characters_list.add("Kamiya");
		characters_list.add("Geeta");
		characters_list.add("Kailash");
		characters_list.add(null);
		System.out.println(characters_list);
	}

	
	public static void main(String[] args) 
	
	{
		CopyOnWriteArrayListClass obj=new CopyOnWriteArrayListClass();
		obj.removeLeadingZerosFromString("00100200300");
		obj.modifyCopyOnWriteArrayList();
	}

}
