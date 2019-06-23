package studystuff_geeksforgeeks_algorithm;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.poi.util.ArrayUtil;


//Selection sort selects the minimum value among all the values and send it to begining of array
//Worst complexity: n^2
//Best complexity: n^2


public class SelectionSort_ByIndex 

{

	
	public static int[] selectionSort(int arr[])
	{
		int n = arr.length; 
		for(int i=0;i<n-1;i++)
		{
			int minimumIndex=i;
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]<arr[minimumIndex])
					{
						minimumIndex=j;
					}
				}		
			int temp =arr[i];
			arr[i]=arr[minimumIndex];
			arr[minimumIndex]=temp;
				
			
		}
		
		return arr;
		
	}
	

	
	public static void main(String[] args) 
	
	{
			int arr[]={64,25,12,22,11,72};
			System.out.println(Arrays.toString(selectionSort(arr)));

	}

}
