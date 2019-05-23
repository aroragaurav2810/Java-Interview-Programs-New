package studystuff_interview_questions_all;

import java.util.Scanner;

public class TwoDArrayInsertion_StaticColumnNumbers 


{

	public static void main(String[] args) 
	
	
	{
		int[][] arr = new int[3][5];
		
		System.out.println("rows are "+arr.length);
		
		 // print array in rectangular form
		 for (int r=0; r<arr.length; r++) {
		     for (int c=0; c<arr[r].length; c++) {
		    	 Scanner obj=new Scanner(System.in);
		    	 arr[r][c]=obj.nextInt();//your value
		     }
		 }

		 
		 for (int r=0; r<arr.length; r++) {
		     for (int c=0; c<arr[r].length; c++) {
		    	 //Scanner obj=new Scanner(System.in);
		    	 //obj.next();
		        System.out.print("\t"+arr[r][c]);//your value
		     }
		     System.out.println();
		 }
		 
	}

}
