package studystuff_interview_question_datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch 
{

    public static void main(String[] args) {
           Integer ar1[]=new Integer[]{10,20,30,2,5};
        
           
           int p, key=30;
           p=Arrays.binarySearch(ar1, key);  //  binary search function called using Arrays Class
           System.out.println("Before Sorting element "+ key +" found at index "+p);
           Arrays.sort(ar1); // array sorted using Arrays Class
           System.out.println("Sorted Array");
           System.out.println(""+ar1[0] +","+ar1[1] +","+ar1[2] +","+ar1[3] +","+ar1[4]);
           p=Arrays.binarySearch(ar1, key);
           System.out.println("After Sorting element "+ key +" found at index "+p+" because it is an integer case");     
    }
}


//or, you can also see the below example for binary search


class BinarySearchUsingArraysClass_Preparation 

{

	
	static String ar[]=null;
	static Scanner obj=null;
	static int index;
	static String key;
	public static void main(String str[])
	{
		//int index;
		ar=new String[5];	
		System.out.println("Enter data in an array");
		
		for(int i=0;i<ar.length;i++)
		{
			obj=new Scanner(System.in);
			ar[i]=obj.nextLine();
		}
		System.out.println("Enter Key that needs to be searched");
		obj=new Scanner(System.in);
		key=obj.nextLine();
		
		
		if(Arrays.asList(ar).contains(key))
		// The above statment confirms true or false on the basis of element present in searched container or not  
		{
		index=Arrays.binarySearch(ar,key);
		System.out.println("Before Sorting, key "+key+" found at index "+index);
		System.out.println("Sorted Array");
		Arrays.sort(ar);
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]+" "+ar[3]+" "+ar[4]);
		index=Arrays.binarySearch(ar,key);
		System.out.println("After Sorting, key "+key+" found at index "+index+" because it is String Case");
		}
		else
		{
			System.out.println("key is not present in searching array");
		}
	}
	
}



//NOTE: Binary search is a data structure algo that assumes to be worked on sorted array
//NOTE: Binary search gives undefined result(not accurate) if the searching container is not sorted
//NOTE: Binary search in java needs not to be calculated manually becuase an Arrays class in java has the function Arrays.binarySearch(array, key)
//    which automatically searches the element from searched/sorted container.
//NOTE: Binary search uses the logic: Divide and Conquer which basically divides an array in two parts
//		 and checks the key(to be searched) with the key at mid index
//case1: If match then the same index would be the answer. 
//case2: If the key at mid index is greater than the key(to be searched) then then subArray left to the mid index key would be taken to search the key
//case3: If the key at mid index is less than the key(to be searched) then then subArray right to the mid index key would be taken to search the key

