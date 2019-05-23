package studystuff_interview_question_datastructure;

public class GreatestNumber 


{

	static int []ar={14,26,67,33,22,11,28,98,90};
	
	static int greatest_number;
	
	
	public static void main(String[] args) 
	{
		greatest_number=ar[0];
			for(int i=1;i<ar.length;i++)
			{
				if(ar[i]>greatest_number)
				{
					greatest_number=ar[i];
				}
			}
		System.out.println("greatest number is "+greatest_number);

	}

}

