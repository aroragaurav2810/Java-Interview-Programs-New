package studystuff_geeksforgeeks_algorithm;

import java.util.Arrays;

// BubbleSort, as the name refers, it is a sorting algorithm that is based on bubble approach means
// compare two collective(together) elements and sort them at the same time
// Worst complexity: O(n^2) 
// Best complexity: O(n)
public class BubbleSort 

{

	public static int[] bubbleSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) 
	
	{
			int arr[]={64,25,72,22,11,70};
			System.out.println(Arrays.toString(bubbleSort(arr)));
	}

}
