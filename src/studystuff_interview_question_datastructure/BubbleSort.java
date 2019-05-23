package studystuff_interview_question_datastructure;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort

{
	private static void bubbleSort(int[] intArray)
	{
		int t;
		for(int i=0;i<intArray.length-1;i++)
		{
		for(int j=1; j<(intArray.length-i);j++)
		{
			if(intArray[j-1]>intArray[j])
			{
				t=intArray[j-1];
				intArray[j-1]=intArray[j];
				intArray[j]=t;
				
			}
			
		}
		}
	}

	public static void main(String[] args) 	
	{
		
		int intArray[]={12,34,8,9,13,45,67,66,55,44,33};
		System.out.println("Array before bubble sort");
		for(int i=0; i < intArray.length; i++)
		{
            System.out.print(intArray[i] + " ");
		}
		bubbleSort(intArray);
		//System.out.println();
		System.out.println("\n Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
                System.out.print(intArray[i] + " ");
        }
		
}

}

	// NOTE: In Bubble Sort, as name refers, Bubbles i.e two elements in an array starting from begining: 
	// i.e. index[0] and index[1], compares/matches with each other. if both are not in order then swap each other- condition under second loop in this code represents this
	// this process continues until iteration till array length completes()- first loop in this code represents this.
	// In each iteration, there are multiple iteration that iterates till array.length minus iteration value which fixes one highest value at the end in order to sort an array
	// Second loop in this code represents this
    //Take an example of array={10,20,30,2,5} to evaluate the sort manually and create a code accordingly
