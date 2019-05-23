package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) 
	
	{
			
		int arr1[]=new int[]{100,20,30,400,5};
		Object arr2[]= {arr1};
		System.out.println("Array printing in one go: "+Arrays.toString(arr2));
		System.out.println("Deep Array printing in one go: "+Arrays.deepToString(arr2)); // deep means: for object type of array
		// Here deep means array in an array for example: int array assigned to object array like int ar1[]={1,2,3};	Object ar2[]= {ar1};
		Arrays.sort(arr1);
		System.out.println("Sorted Array: "+Arrays.toString(arr1));
		
		
		
	}

}
