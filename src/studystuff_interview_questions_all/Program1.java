package studystuff_interview_questions_all;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 

{
	static Scanner scan=null;
	static int intArray[]=null;
	static List<Integer> list=null;
	private static void Sort(int[] intArray)
	{
		int t;
		
		for(int i=intArray.length-1; i>0;i=i-2)
		{
			if(intArray[i]<intArray[i-1])
			{
				t=intArray[i-1];
				intArray[i-1]=intArray[i];
				intArray[i]=t;
				
			}
			
		
		}
	}

	public static void main(String[] args) 	
	{
		list=new ArrayList();
		scan=new Scanner(System.in);
		
		
		System.out.println("Enter values, you want to sort accordingly");
		
		
		while(scan.hasNextInt())
		{
			 list.add(scan.nextInt());
		}
		System.out.println(list.size());
		intArray=new int[list.size()];
		
		
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i]=list.get(i);
			System.out.println(intArray[i]);
		}
		
		System.out.println("Array existing values");
		for(int i=0; i < intArray.length; i++)
		{
            System.out.print(intArray[i] + " ");
		}
		Sort(intArray);
		//System.out.println();
		System.out.println("\n Array values after change");
        for(int i=0; i <intArray.length; i++){
                System.out.print(intArray[i] + " ");
        }
		
}
}