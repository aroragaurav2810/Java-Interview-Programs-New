package studystuff_interview_question_datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SortAnArrayUsingCollectionsClassOnListObject 


{

	static int []ar=new int[5];
	
	static Scanner obj=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter data in array");
		for(int i=0; i<ar.length;i++)
		{
			System.out.println("Enter value in array "+i+"th"+" Element");
			ar[i]=obj.nextInt();
		}
		List<Integer> obj_list=new ArrayList<Integer>();
		for(int i=0; i<ar.length; i++)
		{
		obj_list.add(ar[i]);
		}
	Collections.sort(obj_list);;   // Logic: it is not collection interface, it is Collections class
	
	System.out.println("Sorted Array is "+obj_list);
	}

	
}
