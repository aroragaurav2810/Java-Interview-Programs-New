package studystuff_geeksforgeeks_string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseAStringUsingArrayList 

{

	public static void main(String[] args) 
	
	{
		 
			/*
			 Steps:
				
				1. We copy String contents to an object 
				   of ArrayList.
				1. We create a ListIterator object by using 
				   the listIterator() method on the LinkedList 
				   object.
				2. ListIterator object is used to iterate over 
				   the list.
				3. ListIterator object helps us to iterate 
				   over the reversed list and print it one 
				   by one to the output screen.
			 */
		String str="Geeks for Geeks";
		
		List<Character> list_characters=new ArrayList<Character>();
		for(int i=str.length()-1;i>=0;i--)
		{
			list_characters.add(str.charAt(i));
		}
		
		Iterator<Character> iterator=list_characters.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
		
		
	}

}
