package studystuff_interview_questions_all;

public class SelectionSort {
	
	
	public static int[] selectionSort(int[] arr)
	{
		//int new_ar[];
		for(int i=0;i<arr.length;i++)
		{
			int smallest_no=arr[i];
			int temp;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<smallest_no)
				{
					temp=arr[j];
					arr[j]=smallest_no;
					smallest_no=temp;
				}
				
			}
			arr[i]=smallest_no;
			
		}
		return arr;
	}

	public static void main(String[] args) 	
	{
		
		
		
		int intArray[]={12,34,8,9,13,45,67,66,55,44,33};
		System.out.print("Array before Selection sort \n");
			for(int i=0; i < intArray.length; i++)
			{
	            System.out.print(intArray[i] + " ");
			}
		intArray=selectionSort(intArray);
		System.out.println("\nArray After Selection Sort");
	        for(int i=0; i < intArray.length; i++){
	                System.out.print(intArray[i] + " ");
	        }
		
}		
		
}

// Selection sort, as name refers, it sorts the container by selecting the smallest and keep it in the 0th index then ist index respectively.
// This process continues until the last element/index is reached/covered

// NOTE: Please refer: http://www.tutorialspoint.com/data_structures_algorithms/selection_sort_algorithm.htm


