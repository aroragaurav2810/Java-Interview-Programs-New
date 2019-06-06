package studystuff_interview_questions_all;

public class SmallestNumber 


{

	static int []ar={2,12,26,6,98,999,76,3};
	
	static int smallest_number;
	
	
	public static void main(String[] args) 
	{
		smallest_number=ar[0];
			for(int i=1;i<ar.length;i++)
			{
				if(ar[i]<smallest_number)
				{
					smallest_number=ar[i];
				}
			}
		System.out.println("smallest number is "+smallest_number);

	}

}

