package studystuff_geeksforgeeks_string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;



public class RemoveTrailingOrLeadingZerosFromString_ByCollection 

{
	
public void removeTrailingZerosFromString(String str1) 
	
	{
		System.out.println("Remove Trailing Zeros from String");
		System.out.println("String is: "+str1);
		String str=str1;
		List<Character> characters_list=new CopyOnWriteArrayList<>();
		int i=str.length()-1; 
		while(i!=-1)
		{
			characters_list.add(str.charAt(i));
			i--;
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
		Collections.reverse(characters_list);
		String newstr="";
		for(Character ch:characters_list)
		{
		newstr=newstr+ch;
		
		}
		
		System.out.println("Removed Trailing Zeros from String: "+newstr);	
	}
	
	
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
	
		String newstr="";
		for(Character ch:characters_list)
		{
		newstr=newstr+ch;
		}
		
		System.out.println("Removed Leading Zeros from String: "+newstr);
	}
	
	
	

	public static void main(String[] args)
	
	{
		RemoveTrailingOrLeadingZerosFromString_ByCollection obj=new RemoveTrailingOrLeadingZerosFromString_ByCollection();
		
		obj.removeTrailingZerosFromString("00001122003300");
		System.out.println();
		obj.removeLeadingZerosFromString("00001122003300");
			
			
	}

}
