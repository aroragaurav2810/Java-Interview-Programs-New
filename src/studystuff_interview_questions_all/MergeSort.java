package studystuff_interview_questions_all;

import java.util.Arrays;


/*Logic: In merge sorting algorithm unsorted values are divided into two equal parts iteratively. 
Then merge both parts and sort it. Then again merge the next part and sort it. 
Do it iteratively until  the values are not in sorted order. 
In merge sorting the number of elements must be even
*/


public class MergeSort
{
	  
	public static void main(String a[])
	  {
		  int array[] = {12,9,4,99,120,1,3,10};
		  System.out.println("Values Before the sort:");
		  for(int temp:array)
		  {
			  System.out.println(temp);
		  }
		  System.out.println("Values after sort");
		  Arrays.sort(array);
		  for(int temp:array)
		  {
			  System.out.println(temp);
		  }
		  System.out.println("PAUSE");
	  mergeSort_srt(array, array[0], array[array.length-1]);
	  }
	  
	  public static void mergeSort_srt(int array[],int lo, int hig)
	  {
		  int low = lo;
		  int high = hig;
		  if (low >= high) 
		  {
		  return;
		  }
		  
	  int middle = (low + high) / 2;
	  mergeSort_srt(array, low, middle);
	  mergeSort_srt(array, middle + 1, high);
	  int end_low = middle;
	  int start_high = middle + 1;
	  while ((lo <= end_low) && (start_high <= high)) {
	  if (array[low] < array[start_high]) {
	  low++;
	  } else {
	  int Temp = array[start_high];
	  for (int k = start_high- 1; k >= low; k--) {
	  array[k+1] = array[k];
	  }
	  array[low] = Temp;
	  low++;
	  end_low++;
	  start_high++;
	  }
	  }
	  }  
	}