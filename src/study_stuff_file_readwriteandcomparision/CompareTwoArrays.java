package study_stuff_file_readwriteandcomparision;

import java.util.Arrays;

public class CompareTwoArrays 


{

	public static void main(String[] args)
	
	
	{
			String arr1[][]=new String[][]{{"gaurav", "arora"},{"gopi","sharma"},{"twinkle","madaan"},{"gautam","arora"}};
			
			String arr2[][]=new String[][]{{"gaurav", "arora"},{"gopi","sharma"},{"twinkle","madaan"},{"gautam","arora"}};
			
			
			
			
			if(Arrays.deepEquals(arr1,arr2))
			{
				System.out.println("2D Arrays are equal");
			}
			else
			{
				System.out.println("2D Arrays are not equal");
			}
			
			
			String arr3[]=new String[]{"gaurav", "arora"};
			
			String arr4[]=new String[]{"gaurav", "arora"};
			
			if(Arrays.equals(arr3,arr4))
			{
				System.out.println("1D Arrays are equal");
			}
			else
			{
				System.out.println("1D Arrays are not equal");
			}
			
			
	}

}
