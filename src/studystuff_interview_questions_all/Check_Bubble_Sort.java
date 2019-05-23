package studystuff_interview_questions_all;

public class Check_Bubble_Sort {
	
	static int t;
	public static void bubbleSort(int []array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i;j++)
			{
			 if(array[j-1]>array[j])
			 {
				 t=array[j-1];
				 array[j-1]=array[j];
				 array[j]=t;
			 }
			}
		}
	}

	public static void main(String[] args)
	
	{
		int ar[]=new int[]{10,20,30,2,5};
		System.out.println("Array before bubble sort");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("\t"+ar[i]);
		}
		System.out.println();
		bubbleSort(ar);
		System.out.println("Array after bubble sort");
		
		
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("\t"+ar[i]);
		}
	}

}
