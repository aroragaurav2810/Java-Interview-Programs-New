package study_stuff_exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CheckConcurrentModificationException 

{

// ConcurrentModificationException is a run time exception that comes when you parallely/concurrently/simultaneously	
// updating/modifying and using a list or anything. It does same work as it's name represents
	
	
// Solution : 
// Thus, to give a solution to such exception, java has array or 
// a collection class over list collection called as CopyOnWriteArrayList or
// a collection class over hash map collection called as ConcurrentHashMap.	
	public static void main(String[] args)
	
	{
			
			String str="00001122003300";
			List<Character> characters_list=new ArrayList<>();
			
			int i=str.length()-1; // 13
			while(i!=-1)
			{
				characters_list.add(str.charAt(i));
				i--;
			}
			
			System.out.println(characters_list);	
			
			// Simple loop is fail safe or list/set/map is fail safe in case of simple loop
			for(int j=0;j<characters_list.size();j++)
			{
				if(characters_list.get(j).compareTo('0')==0)
				{
					// removing character from a list(character_list) dyamically and then using the same modified list in loop again 
					characters_list.remove(characters_list.get(j));
				}
				else
				{
					break;
				}
			}
			System.out.println(characters_list);	
			
			// Special Loop or enumeration or iterator is fail fast whereas above logic of simple loop is fail safe 
			// list/set/map is fail fast in case of special Loop or enumeration or iterator
			for(Character character:characters_list)
			{
				if(character.compareTo('0')==0)
				{
					// removing character from a list(character_list) dyamically and then using the same modified list in loop again 
					characters_list.remove(character);
				}
				else
				{
					break;
				}
			}
			System.out.println(characters_list);	
			
	}

}
