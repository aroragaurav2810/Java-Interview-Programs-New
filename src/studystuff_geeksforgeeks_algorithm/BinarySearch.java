package studystuff_geeksforgeeks_algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;

import com.google.inject.Key;

public class BinarySearch 

{

	public static void main(String[] args) 
	
	{
			
		int arr[]={5,10,15,20,25,30,35,40,45,50};
		int key=50;
		int first_index=0;
		int last_index=arr.length;
		
		if(IntStream.of(arr).anyMatch(x -> x == key))
		{
			binarySearch(arr,key,first_index,last_index);
		}
		else
		{
			System.out.println("Key is not found in array");
		}
		
	

	}

	public static void binarySearch(int arr[], int key, int first_index, int last_index)
	{
		int mid=(first_index)+(last_index)/2;
		if(key<arr[mid])
		{
			first_index=0;
			last_index=mid;
			binarySearch(arr, key, first_index, last_index);		
		}
		
		
		else if(key>arr[mid])
		{
			first_index=mid;
			last_index=arr.length-1;
			binarySearch(arr, key, first_index, last_index);		
		}
		
		else
		{
			System.out.println("Key "+key+" found at given index: "+mid);
		}
		
	}
	
}
