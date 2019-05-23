package studystuff_interview_questions_all;

import java.util.Arrays;

public class SortingAnArrayUsingArraysClassOnArrayObject extends example2
{
	
	
	
	
	
	
	public static void main(String[] args) 
	{
			
		
		int ar[]={1,21,34,12,86,02};
		System.out.println("Array Existing Ordering");
		for(int temp:ar)
		{
			
			System.out.println(temp);
		}
		
		Arrays.sort(ar); // great logic, It is an Arrays Class
		System.out.println("Sorting of an array in ascending order");
		for(int temp:ar)
		{
			
			System.out.println(temp);
		}
		int index=Arrays.binarySearch(ar,86);
		// before applying this function(binarySearch(array_name,key)) of class Arrays, an array must be sorted in ascending order
		
		System.out.println("Index of digit 86 is "+ index);
		System.out.println("Sorting of an array in descending order");
		for(int i=ar.length-1;i>=0;i--)
		{
			
			System.out.println(ar[i]);
		
		}
		
		example2 obj1=new SortingAnArrayUsingArraysClassOnArrayObject();
		example2 obj2=new example2();
		
		
	}

}

class example2
{
	public int function1(int x)
	{
		System.out.println(" Function of class example 2");
		return 0;
	}
}
