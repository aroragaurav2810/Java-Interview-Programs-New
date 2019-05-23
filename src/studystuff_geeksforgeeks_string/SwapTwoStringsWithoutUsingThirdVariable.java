package studystuff_geeksforgeeks_string;

public class SwapTwoStringsWithoutUsingThirdVariable 


{
	// NOTE: Swapping means merging and splitting

	// Swapping with 3rd variable or without 3rd variable requires merging/concatenation and splitting/substring
	// Let's say there are two string "Gaurav" and "Arora". So, firstly, we need to merge them like "GauravArora" and then
	// split/substring them using actual string lengths.
	
	public static void main(String[] args) 
	
	{

		String str1="Gaurav";
		int str1_length=str1.length(); //6
		System.out.println("String before swapping str1: "+str1);
		
		String str2="Arora";
		int str2_length=str2.length(); //5
		System.out.println("String before swapping str2: "+str2);
		
		str1=str1+str2; // GauravArora
		int str1_merged_length=str1.length(); //11
		
		// logic:
		str2=str1.substring(0,str1_length);
		str1=str1.substring(str1_length,str1_merged_length);
		
		System.out.println("String after swapping str1: "+str1);
		System.out.println("String after swapping str2: "+str2);

	}

}
