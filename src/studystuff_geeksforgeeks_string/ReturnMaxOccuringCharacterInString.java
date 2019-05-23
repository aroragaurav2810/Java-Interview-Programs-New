package studystuff_geeksforgeeks_string;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


public class ReturnMaxOccuringCharacterInString {

	
	static char first_key;
		
static Object[] key_set;
		public static void main(String[] args) 
		
		
		{
			
					String str;
					String str_withoutspace;
					System.out.println("Enter String of your choice ");
					Scanner obj=new Scanner(System.in);
					str=obj.nextLine();
					str_withoutspace=str.replace(" ", "");
					System.out.println("Your String without space is "+str_withoutspace);
					int count = 1;
					HashMap<Character,Integer> map=new LinkedHashMap<Character, Integer>();
					for(int i=0; i<str_withoutspace.length();i++)// gauravarora
					{
						
						if(map.containsKey(str_withoutspace.charAt(i)))
						{
							map.put(str_withoutspace.charAt(i), map.get(str_withoutspace.charAt(i))+1);
						}
						else
						{
						map.put(str_withoutspace.charAt(i), count);
						}
					}
					
					System.out.println("map containing"+map);
					
					 key_set=map.keySet().toArray();

					for(Object temp:key_set)
					{
								first_key=(char)temp;
								System.out.println(first_key);
								break;
					}
					
					int largest_no=map.get(first_key);
					System.out.println("largest no is: "+largest_no);
					for(int k=1;k<map.size();k++)
					{
						
						if(map.get(key_set[k])>largest_no)
						{
							largest_no=map.get(key_set[k]);
						}
						
					}
					
					System.out.println("value of character having max count is "+largest_no);	
		}

	}
