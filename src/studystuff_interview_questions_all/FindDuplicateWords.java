package studystuff_interview_questions_all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class FindDuplicateWords 

{

	
	
	public static void main(String args[])
	{
		
		String sentence="Gaurav Arora is from Arora family";
		String word_array[]=sentence.split(" ");
		Map<String, Integer> word_container=new HashMap<String, Integer>();
		int count=1;
		System.out.println(Arrays.toString(word_array));	
		for(String word:word_array)
		{
			if(word_container.containsKey(word))
			{
				word_container.put(word, word_container.get(word)+1);
			}
			else
			{
				word_container.put(word, count);
			}
		}
		System.out.println(word_container);
		Set<Entry<String,Integer>> entrySet=word_container.entrySet();
		for(Entry entry:entrySet)
		{
			//System.out.println(entry.getValue());
			if(Integer.parseInt(entry.getValue().toString())>1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
	
	
	
}
