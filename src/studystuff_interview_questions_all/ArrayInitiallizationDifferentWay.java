package studystuff_interview_questions_all;

public class ArrayInitiallizationDifferentWay {

	public static void main(String[] args) 
	
	{
		int []ar=new int[5];
		int ar1[] = null;
		int []ar2={1,2,3,4,5};
		int ar3[]=new int[]{1,2,3};
		int ar4[][]=new int[2][5];
		int [][]ar5=new int[5][];
		
		//System.out.println(ar1[]); // null pointer exception
		System.out.println(ar[0]); // by default give  value 0 because array of int type
		System.out.println(ar2[0]); 
		

	}

}
