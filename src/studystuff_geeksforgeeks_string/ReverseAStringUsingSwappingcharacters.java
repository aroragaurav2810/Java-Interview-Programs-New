package studystuff_geeksforgeeks_string;

public class ReverseAStringUsingSwappingcharacters

{
	
	/*
Steps:
1. Set the left index equal to 0 and right 
   index equal to the length of the string -1.
2. Swap the characters of the start index 
   scanning with the last index scanning 
   one by one. After that, increase the left 
   index by 1 (left++) and decrease the right 
   by 1 i.e., (right--) to move on to the next 
   characters in the character array .
3. Continue till left is less than or equal to
   the right.
   */

	public static void main(String[] args) 
	
	{
			
		String str="geeks for geeks";
		// or String str="1234436452251";
		
		char []char_array=str.toCharArray();
		char [] reverse_char_array=new char[char_array.length];
		
		int leftindex=0;  
		int rightindex=char_array.length-1;  
		for(int i=0;i<=char_array.length-1;i++)
		// 0<5,1<5,2<5
		{
			
			// 0<4, 1<3, 2<2, 
			//0<5,1<4,2<3
			if(leftindex<rightindex)
			{
				reverse_char_array[leftindex]=char_array[rightindex];
				reverse_char_array[rightindex]=char_array[leftindex];
				leftindex++;
				rightindex--;
			}
			else
			{
				reverse_char_array[leftindex]=char_array[rightindex];
				// or reverse_char_array[rightindex]=char_array[leftindex];
				break;
			}
			
		}
		System.out.println("Reverse of String using index Swapping technique: "+new String(reverse_char_array));
		
		

	}

}
