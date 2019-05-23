package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class FinalArrayInJava 

{
	
	
	public static void main(String[] args) 
	
	{
		final int arr1[]=new int[]{1,2,3,4,5};
		int arr2[]=new int[]{10,20,30,40,50};
		// line 1:
		arr2=arr1;
		// line 2:
		//arr1=arr2;
		
		// line 3:
		arr1[0]=100;
		arr1[1]=200;
		arr1[2]=300;
		arr1[3]=400;
		arr1[4]=500;
		
	}

}



// NOTE: Talking about final array, As array is also a reference variable so it will behave in same manner as you can see for reference variable
// i.e. see below note: 
//NOTE: You can not assign value/variable/reference variable again to a final variable/reference variable. see line 2
//NOTE: However, you can assign final variable/final reference variable to a variable/reference variable. see line 1 

// but there is a logic the final array elements are assigned values again even their array is final.  see line 3
