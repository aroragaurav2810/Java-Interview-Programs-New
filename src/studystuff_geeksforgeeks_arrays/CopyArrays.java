package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) 
	
	{
			int ar1[]=new int[]{1,2,3};
			
			int ar2[]=Arrays.copyOf(ar1, 3);
			System.out.println("Original Array: "+Arrays.toString(ar1));
			System.out.println("Copied Array with same length: "+Arrays.toString(ar2));

			
			int ar3[]=Arrays.copyOf(ar1, 2);
			System.out.println("Original Array: "+Arrays.toString(ar1));
			System.out.println("Copied Array with lower length: "+Arrays.toString(ar3));

			
			
			int ar4[]=Arrays.copyOf(ar1, 5);
			System.out.println("Original Array: "+Arrays.toString(ar1));
			System.out.println("Copied Array with more length: "+Arrays.toString(ar4));

			
	}
	
	

}
