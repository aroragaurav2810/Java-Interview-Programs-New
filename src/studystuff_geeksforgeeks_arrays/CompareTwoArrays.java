package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class CompareTwoArrays 

{
// To Compare two arrays, we have equals function of Arrays class , 
// Two arrays can not be compared by == operator because arrays are also objects/Reference Variables
// NOTE: Arrays class equal() method is not used for deep comparing the arrays for e.g. array of object type or 2D array. 
// To deep compare, Arrays class has different method called as deepEquals()	
// Here deep means array in an array for example: 2D array or int array assigned to object array like int ar1[]={1,2,3};	Object ar2[]= {ar1};
// Similar to deepEquals() there is another method also called as deepToString(2D array)	
	
	public static void main(String[] args) 
	
	{
		int ar1[]=new int[]{1,2,3};
		int ar2[]=new int[]{1,2,3};
		CompareTwoArrays obj1=new CompareTwoArrays();
		System.out.println("Compare Two Arrays Using Equal Opeator");
		obj1.compareTwoArraysUsingEqualOpeator(ar1,ar2);
		System.out.println("Compare Two Arrays Using Equal function");
		obj1.compareTwoArraysUsingEqualFunction(ar1,ar2);
		Object ar3[]= {ar1};
		Object ar4[]= {ar2};
		Object ar5[]= {ar3};
		Object ar6[]= {ar4};
		
		System.out.println("Compare Two Arrays Using Deep Equal function");
		obj1.compareTwoArraysUsingDeepEqualFunction(ar3,ar4);
		System.out.println("Compare Two Arrays Using More Deep Equal function");
		obj1.compareTwoArraysUsingDeepEqualFunction(ar5,ar6);
		int ar7[][]=new int[][]{{1,2,3},{4,5,6}};
		int ar8[][]=new int[][]{{1,2,3},{4,5,6}};
		System.out.println("Compare 2D Arrays Using Deep Equal function");
		obj1.compare2DArraysUsingDeepEqualFunction(ar7,ar8);
		
		
		System.out.println("1D array i.e. array2 is "+Arrays.toString(ar2));
		System.out.println("Object type array i.e. array6 is "+Arrays.deepToString(ar6));
		System.out.println("2D array i.e. array7 is "+Arrays.deepToString(ar7));
	}

	public void compareTwoArraysUsingEqualOpeator(int ar1[],int ar2[])
	{
		if(ar1==ar2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
	}
	
	public void compareTwoArraysUsingEqualFunction(int ar1[],int ar2[])
	{
		if(Arrays.equals(ar1, ar2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	
	public void compareTwoArraysUsingDeepEqualFunction(Object ar3[],Object ar4[])
	{
		if(Arrays.deepEquals(ar3, ar4))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	
	public void compare2DArraysUsingDeepEqualFunction(int ar7[][],int  ar8[][])
	{
		if(Arrays.deepEquals(ar7, ar8))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	
}
