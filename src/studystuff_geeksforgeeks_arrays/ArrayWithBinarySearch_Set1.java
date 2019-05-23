package studystuff_geeksforgeeks_arrays;

import java.util.Arrays;

public class ArrayWithBinarySearch_Set1 

{
	// This set1 is is to search an element in main array
	
	// Binary means involving of two things. 
	
	// Arrays.binarySearch() is the simplest and most efficient method 
	// to find an element in a sorted array in Java
	
	// For Binary search , an array must be sorted otherwise there is no guarantee of output like searched element

	// Also, if duplicate elements/values are present then also there is no guarantee of output like searched element  
	
	// Difference between Arrays.binarySearch(array,key) and Collections.binarySearch(list,key)
	// one works on array and another works on list
	public static void main(String[] args) 	
	{
		byte byteArr[] = {10,20,15,22,35};
        char charArr[] = {'g','p','q','c','i'};
        int intArr[] = {10,20,15,22,35};
        double doubleArr[] = {10.2,15.1,2.2,3.5};
        float floatArr[] = {10.2f,15.1f,2.2f,3.5f};
        short shortArr[] = {10,20,15,22,35};
 
        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);
  
        
  System.out.println("Sorted byte array "+Arrays.toString(byteArr));    
  System.out.println("Sorted char array "+Arrays.toString(charArr));
  System.out.println("Sorted int array "+Arrays.toString(intArr));
  System.out.println("Sorted double array "+Arrays.toString(doubleArr));
  System.out.println("Sorted float array "+Arrays.toString(floatArr));
  System.out.println("Sorted short array "+Arrays.toString(shortArr));
  
  
        byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;
        
        
System.out.println(byteKey + " found at index = "+Arrays.binarySearch(byteArr,byteKey));
System.out.println(charKey + " found at index = "+Arrays.binarySearch(charArr,charKey));
System.out.println(intKey + " found at index = "+Arrays.binarySearch(intArr,intKey));
System.out.println(doubleKey + " found at index = "+Arrays.binarySearch(doubleArr,doubleKey));
System.out.println(floatKey + " found at index = "+Arrays.binarySearch(floatArr,floatKey));
System.out.println(shortKey + " found at index = "+Arrays.binarySearch(shortArr,shortKey));
        

	}

}
