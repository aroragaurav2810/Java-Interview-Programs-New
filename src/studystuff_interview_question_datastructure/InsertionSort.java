package studystuff_interview_question_datastructure;

public class InsertionSort 

{
	
	
	 
		public static int[] insertionSorting(int []arr)
		{
			int swap;
			for(int i=1;i<arr.length;i++)
			{
				for(int j=i;j>0;j--)
				{
				
					if(arr[j]<arr[j-1])
					{
						swap=arr[j];
						arr[j]=arr[j-1];
						arr[j-1]=swap;			
					}
				}
			}
			
			
			return arr;
		}
	 
	 
	public static void main(String[] args) 
	
	{
		int []ar={10,34,2,56,7,67,88,42};
		System.out.println("Array bofore sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		ar=insertionSorting(ar);
		System.out.println("Array after sorting");
	
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}


// Insertion Sort, as name refers, insert an element in the container in such a position 
// so that the container gets sort.
// Insertion sort is the advance sort of Bubble sort.
// In this sort, two elements(bubbles) compares each other and swap if they are not at proper location, This is in first iteration which is represented by first and second loop
// with each iteration, element compares with further element and if swap occurs then again the swapped element is compared with first element, This is in Second iteration which is represented by first and second loop
// for future reference of insertion sort history, please refer: http://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm
// 
